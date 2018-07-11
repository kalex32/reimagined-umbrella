import java.util.Arrays;
// import java.util.Scanner;

public class Arr_10 {
    public static void main(String[] args) {
        System.out.println ("Заполните массив десятью целыми числами" );
       // Scanner scan = new Scanner (System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round (Math.random ()*1000);
                    //scan.nextInt ( );
        }
        //scan.close ();
        System.out.println (Arrays.toString (arr));
        System.out.println (" " );

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println (Arrays.toString (arr));



        }

    }

