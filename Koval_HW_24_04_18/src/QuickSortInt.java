public class QuickSortInt {
    // Организовать вызов фактического метода быстрой сортировки
    static void qsort(int items[]) {
        qs (items, 0, items.length - 1);
    }

    // Рекурсивная версия метода быстрой сортировки символов
    private static void qs(int[] items, int left, int right) {
        int i, j;
        int x, y;
        i = left;
        j = right;
        x = items[(left + right) / 2];
        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left)) j--;
            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        } while (i <= j);
        if (left < j) qs (items, left, j);

        if (i < right) qs (items, i, right);

    }
}

class QSDemo {
    public static void main(String[] args) {
        int a[] = {3, 7, 8, 2, 1, 5, 4};
        int i;
        System.out.println ("Исходный массив: ");
        for (i = 0; i < a.length; i++) {
            System.out.print (a[i] + " ");
        }
        System.out.println ( );

        // Осортировать массив
        QuickSortInt.qsort (a);
        System.out.println ("Отсортированный массив: ");
        for (i = 0; i < a.length; i++) {
            System.out.print (a[i] + " ");

        }
    }
}
