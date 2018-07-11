import java.util.Arrays;
import java.util.Random;

public class ArrayMax {

    public static void main(String[] args) {

        int[] array = new int[5];
        Random random = new Random ( );
        //Scanner scanner = new Scanner (System.in);
        for (int i = 0; i < array.length; i++) {
            // array[i] = scanner.nextInt ( );
            array[i] = random.nextInt (100);
        }
        System.out.println (Arrays.toString (array));

        System.out.println (maxElement (array, 0));
    }


    static int maxElement(int[] array, int index) {
        if (index < array.length) {
            int arrayMax = maxElement (array, index + 1);
            if (array[index] > arrayMax) {
                return array[index];
            } else {
                return arrayMax;
            }
        } else {
            return array[0];
        }
    }
}










