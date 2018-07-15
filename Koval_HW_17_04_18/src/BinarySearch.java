import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int first, last, num;
        int[] array = {15, 13, 54, 34, 23, 87, 65};
        Arrays.sort (array);
        System.out.println (Arrays.toString (array));

        first = 0;
        last = array.length;
        num = 87;
        int pos = (first + last) / 2;

        while (array[pos] != num && first <= last) {
            if (array[pos] > num) {
                last = pos - 1;
            } else first = pos + 1;
            pos = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println (num + " является " + ++pos + " элементом в массиве");
        } else System.out.println ("Элемент не найден в массиве");
    }
}
