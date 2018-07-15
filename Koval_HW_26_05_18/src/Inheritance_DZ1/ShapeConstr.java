package Inheritance_DZ1;

public class ShapeConstr {
    private double width;
    private double height;

    ShapeConstr() {
        width = height = 0.0;
    }

    ShapeConstr(double width, double height) {
        this.width = width;
        this.height = height;
    }

    ShapeConstr(double x) {
        width = height = x;
    }

    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    void showDim() {
        System.out.println("Ширина и высота: " + width + " и " + height);
    }
}
