package OOP_DZ2;

import java.util.Scanner;

public class Trapezoid {
    // Даны основания и высоты двух равнобедренных трапеций.
    // Найти суму их периметров.
    // (Определить функцию для расчета периметра равнобедренной трапеции по её основаниям и высоте).

    static double perimeter(int a, int b, int h) {
        return a + b + (Math.sqrt(Math.pow(Math.abs(b - a) / 2, 2) + Math.pow(h, 2))) * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое основание первой трапеции А: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе основание первой трапеции В: ");
        int b = scanner.nextInt();
        System.out.println("Введите высоту первой трапеции Н: ");
        int h = scanner.nextInt();
        System.out.println("Периметр первой трапеции равен: "+perimeter(a,b,h));

        System.out.println("Введите первое основание второй трапеции А: ");
        int c = scanner.nextInt();
        System.out.println("Введите второе основание второй трапеции В: ");
        int d = scanner.nextInt();
        System.out.println("Введите высоту второй трапеции Н: ");
        int e = scanner.nextInt();
        System.out.println("Периметр второй трапеции равен: "+perimeter(c,d,e));

        System.out.println("Сумма периметров двух трапеций равна: "+(perimeter(a,b,h)+perimeter(c,d,e)));
    }
}
