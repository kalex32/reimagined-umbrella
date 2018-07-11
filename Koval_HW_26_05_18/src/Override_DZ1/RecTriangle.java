package Override_DZ1;

public class RecTriangle {

    static double cathetA;
    static double cathetB;


    public RecTriangle(double cathetA, double cathetB, int ANGLE1, int ANGLE2) {
        this.cathetA = cathetA;
        this.cathetB = cathetB;
        if (ANGLE1 == 90 || ANGLE2 == 90 || 180 - (ANGLE1 + ANGLE2) == 90) {
            System.out.println("Ok, Треугольник прямоугольный!");
        } else {
            System.out.println("Треугольник не прямоугольный!");
            System.exit(0);
        }
    }

    static double height() {
        return (cathetA * cathetB) / Math.sqrt(Math.pow(cathetA, 2) + Math.pow(cathetB, 2));
    }
}
