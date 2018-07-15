import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {

        Random random = new Random ( );
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt (100);
            System.out.print (array[i] + " ");
        }
        System.out.println ("");

        for (int i = 0; i < array.length; i++) {
            // Предполагаем, что первый элемент рассматриваемого фрагмента массива минимальный
            int min = array[i]; // преполагаемый минимальный элемент
            int imin = i; // индекс минимального элемента

            // Просматриваем оставший фрагмент массива и ищем элемент меньший предполагаемого минимума

            for (int j = i + 1; j < array.length; j++) {
                // Если находим новый минимум, то запоминаем его индекс и обновляем значение минимума
                if (array[j] < min) {
                    imin = j;
                    min = array[j];
                }
            }
            // Проверяем, если нашелся элемент меньше текущего, то меняем элементы местами
            if (i != imin) {
                int temp = array[i];
                array[i] = array[imin];
                array[imin] = temp;
            }
            System.out.print (array[i] + " ");
        }
    }
}
