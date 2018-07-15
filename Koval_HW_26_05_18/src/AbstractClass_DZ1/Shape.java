package AbstractClass_DZ1;

abstract class Shape {
    private double width;
    private double height;
    private String name;

    Shape() {
        width = height = 0.0;
        name = "no name";
    }

    Shape(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Ширина и высоты: " + width + " и " + height);
    }

    abstract double area();
}
