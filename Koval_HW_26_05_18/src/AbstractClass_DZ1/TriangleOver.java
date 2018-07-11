package AbstractClass_DZ1;

class TriangleOver extends ShapeOver {

    String style;

    TriangleOver(double width, double height, String style) {
        super(width, height, "теугольник");
        this.style = style;
    }

    TriangleOver(double x) {
        super(x, "треугольник");
        style = "закрашенный";
    }

    TriangleOver(TriangleOver triangleConstruct) {
        super(triangleConstruct);
        style = triangleConstruct.style;
    }

    @Override
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}
