package Inheritance_DZ1;

class Shape {
    private double width;
    private double height;

    Shape(double width, double height) {
        this.width = width;
        this.height = height;
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