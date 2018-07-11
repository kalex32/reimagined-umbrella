import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {62, 84, -32, 5, 0, 14, 52, 82, 58, 71};

        System.out.println (Arrays.toString (arr));

        for (int i = arr.length - 1; i > 0; i--) {
            /* Внешний цикл каждый раз сокращает фрагмент массива, так как внутренний цикл
            каждый раз ставитв конец массива максимальный элемент
             */
            for (int j = 0; j < i; j++) {
                /* Сравниваем элементы попарно, если они имеют неправильный порядок
                то меняем их местами
                 */
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println (Arrays.toString (arr));
    }
}
