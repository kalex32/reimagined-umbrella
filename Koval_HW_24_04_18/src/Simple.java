import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        System.out.println ("Введите Число, не равное 0 и/или 1: ");
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt ( );

        simple (a, 2);
    }


    public static void simple(int a, int c) {
        if (c == a) {
            System.out.println ("Простое число");
            return;
        }
        if (a % c == 0) {
            System.out.println ("Не является простым числом");
        } else {
            simple (a, c + 1);
        }
    }
}
