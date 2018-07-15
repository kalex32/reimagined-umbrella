import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println ("Введите натуральное число:");
        Scanner scanner = new Scanner (System.in);
        long temp = scanner.nextLong ( );
        scanner.close ( );

        ArrayList<Integer> array = new ArrayList<> ( );
        do {
            array.add ((int) (temp % 10));
            temp /= 10;
        } while (temp > 0);
        //System.out.printf(String.valueOf(array));
        //System.out.println();

        Integer[] arr = array.toArray (new Integer[array.size ( )]);
        //System.out.println(Arrays.toString(arr));


        int t = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int b = arr[t];
            arr[t] = arr[i];
            arr[i] = b;
            t--;
        }
        System.out.println (Arrays.toString (arr));
        System.out.println ( );
        System.out.println ("Сумма цифр введенного числа: " + sum (arr, arr.length - 1));
        System.out.println ("Количество цифр введенного числа: " + count (arr, 0));

    }

    public static int sum(Integer[] arr, int index) {
        if (index != 0) {
            return arr[index] + sum (arr, index - 1);
        } else {
            return arr[0];
        }
    }

    public static int count(Integer[] arr, int index) {
        if (index == arr.length) {
            return index;
        } else {
            int counter = count (arr, index + 1);
            return counter++;
        }
    }
}
