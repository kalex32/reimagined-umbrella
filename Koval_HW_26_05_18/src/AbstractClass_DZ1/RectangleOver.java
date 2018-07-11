package AbstractClass_DZ1;

class RectangleOver extends ShapeOver {

    RectangleOver() {
        super();
    }

    RectangleOver(double width, double height) {
        super(width, height, "Прямоугольник");
    }

    RectangleOver(double x) {
        super(x, "прямоугольник");
    }

    RectangleOver(ShapeOver shapeOver) {
        super(shapeOver);
    }

    boolean isSquare() {
        return (getHeight() == getWidth());
    }

    @Override
    double area() {
        return getWidth() * getHeight();
    }
}