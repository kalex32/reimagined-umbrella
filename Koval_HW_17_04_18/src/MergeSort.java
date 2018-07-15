import java.util.Random;

public class MergeSort {
    int array[];
    int arrayLenght = 0;

    public MergeSort(int lenght) {
        if (lenght > 0) {
            array = new int[lenght];
            arrayLenght = lenght;
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort (20);
        ms.fillArray ( ); // заполнение массива случайными числами
        ms.printArray ( ); // вывод в консоль сформированного массива
        ms.sort ( ); // сортировка слиянием
        System.out.println ("Отсортированный массив: ");
        ms.printArray ( ); // вывод отсортированного массива
    }

    // Слияние двух массивов
    private void merge(int workArray[], int lower, int middle, int upper) {
        int i = 0;
        int lowerBond = lower;
        int mid = middle - 1;
        int n = upper - lower + 1;
        while ((lower <= mid) && (middle <= upper)) {
            if (array[lower] < array[middle]) {
                workArray[i++] = array[lower++];
            } else {
                workArray[i++] = array[middle++];
            }
        }
        while (lower <= mid) {
            workArray[i++] = array[lower++];
        }
        while (middle <= upper) {
            workArray[i++] = array[middle++];
        }
        for (i = 0; i < n; i++) {
            array[lowerBond + i] = workArray[i];
        }
    }

    // рекурсивный метод
    private void recMergeSort(int[] workArray, int lower, int upper) {
        if (lower == upper) {
            return;
        } else {
            int middle = (lower + upper) / 2;
            recMergeSort (workArray, lower, middle);
            recMergeSort (workArray, middle + 1, upper);
            merge (workArray, lower, middle + 1, upper);
        }
    }

    // заполнение массива случайными числами
    public void fillArray() {
        if (arrayLenght > 0) {
            Random random = new Random ( );
            for (int i = 0; i < arrayLenght; i++) {
                array[i] = random.nextInt (100);
            }
        }
    }

    // вывод массива
    public void printArray() {
        for (int i = 0; i < arrayLenght; i++) {
            System.out.printf ("%3d", array[i]);
        }
        System.out.println ( );
    }

    public void sort() {
        int[] workArray = new int[arrayLenght];
        recMergeSort (workArray, 0, arrayLenght - 1);
    }
}
