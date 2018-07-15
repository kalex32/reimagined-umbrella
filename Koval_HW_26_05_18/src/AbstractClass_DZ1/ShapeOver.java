package AbstractClass_DZ1;

class ShapeOver {
    private double width;
    private double height;
    private String name;

    ShapeOver() {
        width = height = 0.0;
        name = "No name";
    }

    ShapeOver(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    ShapeOver(ShapeOver shapeOver) {
        width = shapeOver.width;
        height = shapeOver.height;
        name = shapeOver.name;
    }

    ShapeOver(double x, String name) {
        width = height = x;
        this.name = name;
    }

    String getName() {
        return name;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }

    double area() {
        System.out.println("Переопределяемый метод area() ");
        return 0.0;
    }
}