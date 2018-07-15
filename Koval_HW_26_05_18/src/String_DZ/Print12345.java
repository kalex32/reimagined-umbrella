package String_DZ;

public class Print12345 {
    // Дан массив целых чисел 1, 2, 3, 4, 5.
    // Используя метод Arrays.toString() вывести массив на экран без квадратных скобок.


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(toString(arr));
    }


    private static String toString(int[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.toString();
            b.append(", ");
        }
    }
}
