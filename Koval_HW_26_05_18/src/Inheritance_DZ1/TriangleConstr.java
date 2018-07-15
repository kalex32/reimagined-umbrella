package Inheritance_DZ1;

public class TriangleConstr extends ShapeConstr {
    private String style;

    TriangleConstr() {
        super();
        style = "Никакой";
    }

    TriangleConstr(String style, double width, double height) {
        super(width, height);
        this.style = style;
    }

    TriangleConstr(double x) {
        super(x);
        style = "Закрашенный";
    }

    double area() {
        return (getWidth() * getHeight()) / 2;
    }

    void showStyle() {
        System.out.println("Треугольник - " + style);
    }
}
