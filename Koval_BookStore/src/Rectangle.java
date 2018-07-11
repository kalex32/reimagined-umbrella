public class Rectangle extends Shape {
    private double width;
    private double height; // размеры прямоугольника

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
        public void draw() {
        super.draw ();
        System.out.println ("Чертим "+super.getName ()+", шириной = "+width+", высотой = "+height);
        }
}
