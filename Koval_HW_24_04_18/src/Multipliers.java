public class Multipliers {
    static void recursion(int n) {
        int a = 2;
        while (a <= n) {
            if ((n % a) == 0) {
                if (a != n) {
                    System.out.print (a + " ");
                    recursion (n / a);
                } else {
                    System.out.print (a);
                }
                return;
            }
            a++;
        }
    }

    public static void main(String[] args) {
        recursion (132);
    }
}
