package Inheritance_DZ1;

public class ConstrRunner {
    public static void main(String[] args) {
        TriangleConstr triangle1 = new TriangleConstr();
        TriangleConstr triangle2 = new TriangleConstr("Закрашенный", 8.0, 12.0);
        TriangleConstr triangle3 = new TriangleConstr(4.0);

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

        System.out.println("Информация о triangle3: ");
        triangle3.showStyle();
        triangle3.showDim();
        System.out.println("Площадь - " + triangle3.area());
    }
}
