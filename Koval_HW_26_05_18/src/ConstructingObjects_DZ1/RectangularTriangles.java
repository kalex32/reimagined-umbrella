package ConstructingObjects_DZ1;

public class RectangularTriangles {

    double cathetA;
    double cathetB;
    final int ANGLE1 = 90;

    static void isSimilar(RectangularTriangles triangle1, RectangularTriangles triangle2) {
        if (triangle1.cathetA / triangle2.cathetA == triangle1.cathetB / triangle2.cathetB) {
            System.out.println("Треугольники являются подобными");
        } else {
            System.out.println("Треугольники не подобны");
        }
    }
}
