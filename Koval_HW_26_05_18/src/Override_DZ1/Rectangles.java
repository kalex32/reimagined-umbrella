package Override_DZ1;

public class Rectangles {


    static double sideA;
    static double sideB;

    static final int ANGLE1 = 90;
    static final int ANGLE2 = 90;
    static final int ANGLE3 = 90;


    Rectangles(double sideA, double sideB, int ANGLE1, int ANGLE2, int ANGLE3) {
        if (ANGLE1 != 90 || ANGLE2 != 90 || ANGLE3 != 90) {
            System.out.println("Это не прямоугольник");
            System.exit(0);
        } else System.out.println("Ok, это прямоугольник");
    }

    static void isEqual(Rectangles rectangle1, Rectangles rectangle2) {
        if (rectangle1.sideA * rectangle1.sideB == rectangle2.sideA * rectangle2.sideB) {
            System.out.println("Прямоугольники по площади равны!");
        } else {
            System.out.println("Прямоугольники по площади не равны!!!");
        }
    }
}
