public class Triangle extends Shape {
    double side1;
    double side2;
    double side3;

    public Triangle(String name, double side1, double side2, double side3){
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void draw(){
        super.draw ();
        System.out.println ("Чертим "+getName ()+", со сторонами - "+side1+", "+side2+", "+side3);
    }
}
