public class Recursion {
    /* В данном примере рекурсивный метод printArray
    выводит на консоль первые i элементов из массива values
     */
    static int values[];

    //вывести рекурсивно элементы массива
    static void printArray(int i) {
        if (i == 0) {
            return;// прекратить выполняться
        } else {
            printArray (i - 1);
            System.out.println ("[" + (i - 1) + "] " + values[i - 1]);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        values = new int[num];
        int j;

        for (j = 0; j < num; j++) {
            values[j] = j;
        }
        printArray (num);
    }

}
