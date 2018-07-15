import java.util.Arrays;
import java.util.Random;

public class ArrayMaxIndex {
    public static void main(String[] args) {

        int[] array = new int[5];
        Random random = new Random ( );
        //Scanner scanner = new Scanner (System.in);
        for (int i = 0; i < array.length; i++) {
            //array[i] = scanner.nextInt ( );
            array[i] = random.nextInt (100);
        }
        System.out.println (Arrays.toString (array));

        System.out.println ("Индекс максимального элемента массива: " + maxElementIndex (array, 0));
    }


    static int maxElementIndex(int[] array, int index) {
        if (index != array.length - 1) {
            int arrayMaxIndex = maxElementIndex (array, index + 1);
            if (array[index] > array[arrayMaxIndex]) {
                return index;
            } else {
                return arrayMaxIndex;
            }
        } else {
            return index;
        }
    }
}