package Inheritance_DZ1;

class Runner {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(4, 4, "Закрашенный");
        Triangle triangle2 = new Triangle(8.0, 12.0, "Контурный");

        triangle1.setHeight(4);
        triangle1.setWidth(4);
        triangle1.style = "Закрашенный";

        triangle2.setHeight(12.0);
        triangle2.setWidth(8.0);
        triangle2.style = "Контурный";

        System.out.println("Информация о triangle1: ");
        triangle1.showStyle();
        triangle1.showDim();
        System.out.println("Площадь - " + triangle1.area());

        System.out.println();

        System.out.println("Информация о triangle2: ");
        triangle2.showStyle();
        triangle2.showDim();
        System.out.println("Площадь - " + triangle2.area());
        System.out.println();

        Rectangle rectangle = new Rectangle(4, 4);
        System.out.println("Информация о Rectangle: ");
        rectangle.showDim();
        System.out.println("Это квадрат? " + rectangle.isSquare());
        System.out.println("Площадь - " + rectangle.area());
    }

}