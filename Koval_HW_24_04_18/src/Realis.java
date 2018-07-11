import java.util.Scanner;

public class Realis {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        double a = scan.nextDouble ();
        int n = scan.nextInt ();
        scan.close ();

        System.out.println ("a=" + a + ", n=" + n);
        System.out.println (degree (a, n, 0, 1));
    }


    static double degree(double a, int n, int count, double result) {
        if (count < n) {
            result = degree (a, n, count + 1, result);
            result = result * a;
        }
        if (n != 1) {
            return result;
        } else {
            return a;
        }
    }
}







