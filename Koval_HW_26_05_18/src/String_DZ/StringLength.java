package String_DZ;

import java.util.Scanner;

public class StringLength {
    // Запрашивать у пользователя стоки (5 строк).
    // После введения каждой строки вывести размер строки или сообщение «Строка пустая».
    // (не используем условие string.length() == 0).

    public static void main(String[] args) {
        String[] fiveString = new String[5];
        System.out.println("Введите, пожалуйста, пять строк:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < fiveString.length; i++) {
            fiveString[i] = scanner.nextLine();
            char[] stringSymbol = fiveString[i].toCharArray();
            if (stringSymbol.length > 0)
                System.out.println("Длина введенной строки: " + stringSymbol.length + " символов");
            else System.out.println("Строка пустая");
        }
    }
}
