package AbstractClass_DZ1;

public class OverRunner {
    public static void main(String[] args) {
        ShapeOver[] shape = new ShapeOver[5];
        shape[0] = new TriangleOver(8, 12, "контурный");
        shape[1] = new RectangleOver(10);
        shape[2] = new RectangleOver(10, 4);
        shape[3] = new TriangleOver(7);
        shape[4] = new ShapeOver(10, 20, "фигура");

        for (ShapeOver shapes : shape) {
            System.out.println("Объект " + shapes.getName());
            System.out.println("Площадь " + shapes.area());
            System.out.println();
        }
    }
}
