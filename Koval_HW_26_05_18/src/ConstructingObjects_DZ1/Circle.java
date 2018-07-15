package ConstructingObjects_DZ1;

import java.util.Scanner;

public class Circle {
    // В примере с классом Circle выполнить:
    //Создайте в классе Circle метод, вычисляющий длину окружности.
    //Создайте в классе Circle метод, который будет перемещать центр окружности на заданное расстояние.
    //Создайте в классе Circle метод, вычисляющий площадь той окружности, к которой метод применён.

    double x;
    double y;
    double r;

    void printCircle() {
        System.out.println("Окружность с центром (" + x + " ; " + y + ") и радиусом - " + r);
    }

    void zoomCircle(double k) {
        r = r * k;
    }

    double lengthCircle() {
        return 2 * Math.PI * r;
    }

    void printCircle(double x1, double y1) {
        System.out.println("Окружность переместилась и теперь у нее центр (" + (x + x1) + " ; " + (y + y1) + ") и радиус - " + r);
    }

    void areaCircle() {
        System.out.println("Площадь окружности = " + Math.PI * Math.pow(r, 2));
    }
}

class CircleRunner {

    public static void main(String[] args) {
        Circle circle1 = new Circle();

        circle1.printCircle();
        circle1.x = 3;
        circle1.r = 12.3;
        circle1.printCircle();
        System.out.println("Длина окружности = " + circle1.lengthCircle());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите смещение по осям центра первой окружности:");
        circle1.printCircle(scanner.nextDouble(), scanner.nextDouble());
        circle1.areaCircle();

        Circle circle2 = new Circle();
        circle2.r = 3.14;
        circle2.zoomCircle(1.66);
        circle2.printCircle();
        System.out.println("Длина окружности = " + circle2.lengthCircle());
        System.out.println("Введите смещение по осям центра второй окружности:");
        circle2.printCircle(scanner.nextDouble(), scanner.nextDouble());
        circle2.areaCircle();
    }
}
