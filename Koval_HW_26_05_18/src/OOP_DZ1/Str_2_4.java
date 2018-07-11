package OOP_DZ1;

import java.util.Scanner;

public class Str_2_4 {
    // Написать метод, который получает слово и определяет одинаковы ли второй и четвертый символы в нем.

    private static boolean comp(String word) {
        return (word.substring(1, 2).equalsIgnoreCase(word.substring(3, 4)));
    }

    public static void main(String[] args) {
        System.out.println("Напишите, пожалуйста, слово:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if (comp(word)) System.out.println("В вашем слове второй и четвертый символ совпадают");
        else System.out.println("В вашем слове второй и четвертый символ не совпадают");
    }
}
