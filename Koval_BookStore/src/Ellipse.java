public class Ellipse extends Shape {
    private double da;
    private double db;

    public Ellipse(String name, double da, double db){
        super(name);
        this.da = da;
        this.db = db;
    }

    public double getDa(){
        return da;
    }

    public double getDb(){
        return db;
    }

    @Override
    public void draw(){
        super.draw ();
        System.out.println ("Чертим "+getName ()+", диаметр 1 = "+da+", диаметр 2 = "+db);
    }
}
