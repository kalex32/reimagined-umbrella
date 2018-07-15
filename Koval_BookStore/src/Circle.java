public class Circle extends Ellipse {
    public Circle(String name, double da, double db){
        super(name, da, db);
    }
    public boolean isCircle(){
        return getDa () == getDb ();
    }

    @Override
    public void draw(){
        super.draw ();
        System.out.println ("Это "+getName ()+"? - "+isCircle ());
    }

}
