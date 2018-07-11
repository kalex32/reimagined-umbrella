public class Factorial {
    static int fact(int n) {
        int result;
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else result = fact (n - 1) * n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println ("Факториал 5 равен " + fact (5));
        System.out.println ("Факториал 10 равен " + fact (10));
        System.out.println ("Факториал 12 равен " + fact (12));
        System.out.println ("Факториал 15 равен " + fact (15));
    }
}
