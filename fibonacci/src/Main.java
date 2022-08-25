import java.util.*;

public class Main {

    private static List<Long> fn = new ArrayList<>();

    public static void main(String[] args) {
        start();
        Scanner num = new Scanner(System.in);
        System.out.println("Введите число итераций от 1 до 91 включительно");
        int n = num.nextInt();
        count(n);
    }

    private static void start() {
        fn.add(0L);
        fn.add(1L);
    }

    private static void count(int n) {
        if ((n > 0) && (n < 92)) {
            for (int i = 2; i < n + 2; i++) {
                fn.add(fn.get(i - 2) + fn.get(i - 1));
            }
            showAll();
        } else {
            System.out.println("Введенное значение неверно");
        }
    }

    private static void showAll() {
        for (Long i : fn) {
            System.out.print(i + ", ");
        }
    }
}