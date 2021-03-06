import java.util.Arrays;

public class InsertIntoSort {
    public static void main(String[] args) {
        int[] arr = {1, 7, 6, 5, 4, 3, 2};
        System.out.println (Arrays.toString (arr));

        int temp, j;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
        System.out.println (Arrays.toString (arr));
    }
}
