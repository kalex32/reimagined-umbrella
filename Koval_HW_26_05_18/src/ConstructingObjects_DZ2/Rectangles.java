package ConstructingObjects_DZ2;

public class Rectangles {


    double a;
    double b;
    static final int ANGLES = 90;

    static void isEqual(Rectangles rectangle1, Rectangles rectangle2) {
        if (rectangle1.a * rectangle1.b == rectangle2.a * rectangle2.b) {
            System.out.println("Прямоугольники по площади равны!");
        } else {
            System.out.println("Прямоугольники по площади не равны!!!");
        }
    }
}
