package ConstructingObjects_DZ1;


public class Segments {
    // Создайте класс отрезков на координатной плоскости, описав в нём все необходимые свойства,
    // подобрав им понятные имена и правильные типы данных.
    //Создайте в классе метод, проверяющий равна ли длина двух отрезков.
    //С использованием построенного класса создайте два отрезка: один от точки (1;1) до точки (2;2) и
    // второй отрезок от точки (-3;0) до точки (1;1). Проверьте с помощью созданного метода равна ли их длина
    // и если равна, то выведите соответствующее сообщение на экран.

    static int startPointX;
    static int startPointY;
    static int endPointX;
    static int endPointY;

    void printSegment() {
        System.out.println("Отрезок с началом в точке с координатами X: " + startPointX + ", Y: " + startPointY + " и концом" +
                " в точке с координатами X: " + endPointX + ", Y:" + endPointY);
    }

    double length() {
        return Math.sqrt(Math.pow(endPointX - startPointX, 2) + Math.pow(endPointY - startPointY, 2));
    }

    static void checkLength(double length1, double length2) {
        if (length2 == length1) {
            System.out.println("Отрезки по длине равны");
        } else {
            System.out.println("Отрезки не равны");
        }
    }

}