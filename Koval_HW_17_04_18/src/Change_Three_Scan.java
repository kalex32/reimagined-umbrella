import java.util.Arrays;
import java.util.Scanner;

public class Change_Three_Scan {
    public static void main(String[] args) {
        System.out.println ("Введите элементы массива" );
        System.out.println (" " );
        Scanner scan = new Scanner (System.in);
        int[] arr = new int[11];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt ();
        }
        scan.close ();

        System.out.println (Arrays.toString (arr));
        System.out.println (" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %3 == 0){
                arr[i] = 3;
            }
        }
        System.out.println (Arrays.toString (arr));
    }
}
