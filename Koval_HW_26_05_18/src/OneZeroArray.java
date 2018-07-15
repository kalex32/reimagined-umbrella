import java.util.Scanner;

public class OneZeroArray {
    // Напишите программу, используя двумерный массив, которая выводит единички и нули в шахматном порядке.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество строк массива:");
        int row = scanner.nextInt();
        System.out.println("Введите колличество столбцов массива:");
        int column = scanner.nextInt();
        scanner.close();

        int[][] array = new int[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) array[i][j] = 1;
                } else if (j % 2 == 0) {
                    array[i][j] = 0;
                } else array[i][j] = 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
