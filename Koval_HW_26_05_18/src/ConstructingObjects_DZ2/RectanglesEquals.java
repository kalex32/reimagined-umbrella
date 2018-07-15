package ConstructingObjects_DZ2;

import static ConstructingObjects_DZ2.Rectangles.isEqual;

public class RectanglesEquals {
    // Создайте класс прямоугольников, описав в нём все необходимые свойства,
    // подобрав им понятные имена и правильные типы данных.
    //Создайте в классе метод, проверяющий равны ли два прямоугольника по площади.
    //С использованием построенного класса создайте один прямоугольник со сторонами 3 и 8 и
    // второй прямоугольник со сторонами 6 и 4. Проверьте с помощью созданного метода равны ли прямоугольники
    // по площади и если да, то выведите соответствующее сообщение на экран.

    public static void main(String[] args) {
        Rectangles rectangle1=new Rectangles();
        Rectangles rectangle2=new Rectangles();

        rectangle1.a=3;
        rectangle1.b=8;

        rectangle2.a=6;
        rectangle2.b=4;

        isEqual(rectangle1,rectangle2);
    }
}
