package String_DZ;

import java.util.Arrays;
import java.util.Random;

public class TenNumber {
    // Дано 10 целых чисел. Выяснить:
    //Верно ли, что сумма тех из них, которые больше 20, превышает 100.
    //Верно ли, что сумма тех из них, которые меньше 50, есть четное число.

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            if (arr[i] > 20) sum1 = sum1 + arr[i];
            if (arr[i] < 50) sum2 = sum2 + arr[i];
        }
        System.out.println(Arrays.toString(arr));

        if (sum1 > 100) {
            System.out.println("Сумма чисел в данном массиве, значения которых превышают 20, больше 100 и равна: " + sum1);
        } else {
            System.out.println("Сумма чисел в данном массиве, значения которых превышают 20, не больше 100 и равна: " + sum1);
        }

        if (sum2 % 2 == 0) {
            System.out.println("Сумма чисел в данном массиве, значения которых меньше 50 - четное число и равно: " + sum2);
        } else {
            System.out.println("Сумма чисел в данном массиве, значения которых меньше 50 - нечетное число и равно: " + sum2);
        }
    }
}
