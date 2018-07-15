public class LinearSearch {

    public static void main(String[] args) {
        int counter, num;

        // Создаем заполненный массив
        int[] array = {21, 78, 96, 55, 12, 35, 44, 56, 88};
        num = 96;

        for (counter = 0; counter < array.length; counter++) {
            //while(true) {
            if (array[counter] == num) {
                System.out.println (num + " является " + (counter + 1) + " по счету в массиве");
                // Число найдено, завершаем поиск вызовом оператора break
                break;
            }
        }

        if (counter == array.length) {
            System.out.println ("Число " + num + " не найдено в массиве");
        }
    }
}
