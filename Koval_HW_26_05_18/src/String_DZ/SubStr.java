package String_DZ;

import java.util.Scanner;

public class SubStr {
    // Запросить у пользователя строку.
    // Запросить подстроку, проверить содержит ли строка введенную подстроку.
    // Выполнить задание двумя способами:

    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, строку");
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        System.out.println("Введите, пожалуйста, подстроку");
        String text2 = scanner.nextLine();

        int index = text1.indexOf(text2);
        if (index == -1) System.out.println("Строка не содержит подстроку!");
        else System.out.println("Строка содержит подстроку!");

        boolean match = text1.matches("^.*" + text2 + ".*$");
        if (match) System.out.println("Строка содержит подстроку!");
        else System.out.println("Строка не содержит подстроку!");

    }
}
