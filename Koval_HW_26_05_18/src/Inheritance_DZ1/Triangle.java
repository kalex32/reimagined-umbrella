package Inheritance_DZ1;

class Triangle extends Shape {
    String style;

    //    public Triangle(String style, double height, double width) {
//        setHeight(height);
//        setWidth(width);
//        this.style = style;
//    }
    Triangle(double width, double height, String style) {
        super(width, height);
        this.style = style;
    }

    double area() {
        return (getWidth() * getHeight()) / 2;
    }

    void showStyle() {
        System.out.println("Треугольник - " + style);
    }
}
