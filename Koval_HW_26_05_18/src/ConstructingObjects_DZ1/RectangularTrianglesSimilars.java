package ConstructingObjects_DZ1;

import static ConstructingObjects_DZ1.RectangularTriangles.isSimilar;

public class RectangularTrianglesSimilars {
    // Создайте класс прямоугольных треугольников, описав в нём все необходимые свойства,
    // подобрав им понятные имена и правильные типы данных.
    //Создайте в классе метод, проверяющий являются ли два треугольника подобными.
    //С использованием построенного класса создайте два треугольника: один с катетами 3 и 4 и второй с катетами 5 и 6.
    // Проверьте с помощью созданного метода подобны ли треугольники и если да,
    // то выведите соответствующее сообщение на экран.

    public static void main(String[] args) {
        RectangularTriangles triangle1 = new RectangularTriangles();
        RectangularTriangles triangle2 = new RectangularTriangles();

        triangle1.cathetA = 3;
        triangle1.cathetB = 4;
        int angle = triangle1.ANGLE1;

        triangle2.cathetA = 5;
        triangle2.cathetB = 6;
        angle = triangle2.ANGLE1;

        isSimilar(triangle1, triangle2);
    }
}
