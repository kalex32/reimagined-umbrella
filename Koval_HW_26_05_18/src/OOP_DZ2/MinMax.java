package OOP_DZ2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinMax {
    // Рандомно заполнить массив положительными значениями.
    // Написать метод, который находит количество элементов,
    // значение которых больше среднего арифметического минимального и максимального элементов массива и
    // вывести на консоль их номера(напечатать).

    static void element(int[] array) {
        int max = 0;
        int min = array[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        double average = (array[indexMax] + array[indexMin]) / 2;
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
        int count = 0;
        System.out.println("Индексы элементов массива, значения которых больше " +
                "среднего арифметического минимального и максимального элементов массива:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                System.out.print(i + ", ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Общее количество элементов, удовлетворяющих условию составляет: " + count);
    }

    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[i];
        for (int j = 0; j < array.length; j++) {
            array[j] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(array));
        element(array);
    }
}
