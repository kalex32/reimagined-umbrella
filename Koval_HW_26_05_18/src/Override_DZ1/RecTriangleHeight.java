package Override_DZ1;

public class RecTriangleHeight {
    // Создайте класс прямоугольных треугольников, описав в нём все необходимые свойства,
    // подобрав им понятные имена и правильные типы данных.
    //Создайте в классе метод, вычисляющий длину высоты, опущенной на гипотенузу.
    //С использованием построенного класса создайте треугольник с катетами 3 и 4.
    // Вычислите с помощью метода и выведите на экран длину высоты, опущенной на гипотенузу.

    public static void main(String[] args) {
        RecTriangle triangle = new RecTriangle(3, 4, 60, 30);
        System.out.println("Высота, опущенная на гипотенузу треугольника равна: " + RecTriangle.height());
    }
}