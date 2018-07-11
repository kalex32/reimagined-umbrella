package String_DZ;

import java.util.Arrays;
import java.util.Random;

public class FiveNumber {
    // Дан массив пяти целых чисел определить. Увеличить размер массива в два раза.
    // Последние 5 элементов должны хранить нули.
    // Выполнить задание с использованием одного цикла и метода Arrays.toString() для вывода массива.

    public static void main(String[] args) {

        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) arr[i] = random.nextInt(100);
        System.out.println(Arrays.toString(arr));


        // Размер статического массива неизменен, поэтому создается новый, куда можно скопировать старый
        int[] arrLarge = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arrLarge));

        int[] arrNew = new int[10];
        for (int i = 0; i < arrNew.length; i++) {
            if (i < 5) arrNew[i] = arr[i];
            else arrNew[i] = 0;
        }
        System.out.println(Arrays.toString(arrNew));
    }
}
