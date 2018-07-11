public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle ("Rectangle", 50, 80);
        Square square = new Square ("Square", 50, 50);
        Square square1 = new Square ("Square", 50, 75);
        Ellipse ellipse = new Ellipse ("Ellipse", 25, 45);
        Circle circle = new Circle ("Circle", 25, 25);
        Circle circle1 = new Circle ("Circle", 35, 55);
        Triangle triangle = new Triangle ("Triangle", 54, 67, 89);

        Shape[] shapes = new Shape[5];
        shapes[0] = rectangle;
        shapes[1] = square;
        shapes[2] = ellipse;
        shapes[3] = circle;
        shapes[4] = triangle;

        for(int i = 0; i < 5; i++){
            switch (shapes[i].getName ()){
                case "Rectangle":
                    rectangle.draw();
                    System.out.println (" " );
                    break;
                case "Square":
                    square.draw ();
                    System.out.println (" " );
                    break;
                case "Ellipse":
                    ellipse.draw ();
                    System.out.println (" " );
                    break;
                case "Circle":
                    circle.draw ();
                    System.out.println (" " );
                    break;
                case "Triangle":
                    triangle.draw ();
                    System.out.println (" " );
                    break;
            }
        }



        square1.draw ();
        System.out.println (" " );
        circle1.draw ();
        System.out.println (" " );

    }

}