import java.util.Arrays;
import java.util.Scanner;

public class LineSearchUse {
    public static void main(String[] args) {
        System.out.println ("Input elements of array:");
        Scanner scanner = new Scanner (System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt ( );
        }
        scanner.close ( );
        System.out.println (Arrays.toString (arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0){
                arr[i] = 3;
            }
        }

        System.out.println (Arrays.toString (arr));

    }
}
