public class StackRec {
    public static void main(String[] args) {
        a();
    }
    private static void a(){
        System.out.println ("a" );
        b();
        System.out.println ("a2" );
    }
    private static void b(){
        System.out.println ("b" );
        c();
        System.out.println ("b2" );
    }
    private static void c(){
        System.out.println ("c" );
        return;
    }
}
