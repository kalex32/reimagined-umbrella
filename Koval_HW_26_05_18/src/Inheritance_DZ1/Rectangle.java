package Inheritance_DZ1;

class Rectangle extends Shape {
    Rectangle(double width, double height) {
        super(width, height);
    }

    boolean isSquare() {
        return (getWidth() == getHeight());
    }

    double area() {
        return getWidth() * getHeight();
    }
}
