public class Square extends Rectangle {
    public Square(String name, double width, double height) {
        super (name, width, height);
    }


    public boolean isSquare(){
        return getWidth () == getHeight ();
    }

    @Override
    public void draw(){
        super.draw ();
        System.out.println ("Это "+getName ()+"? - "+ isSquare ());
    }
}
