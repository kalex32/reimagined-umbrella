import java.util.Scanner;

public class Symbol {
// Напишите программу Java, чтобы получить символ в указанном индексе в строке.

    public static void main(String[] args) {
        System.out.println("Напишите фразу:");
        Scanner scanner = new Scanner(System.in);
        String object = scanner.nextLine();
        System.out.println(object);
        System.out.println("Какие по счету символы Вы хотите получить?:");
        int symbol1 = scanner.nextInt();
        int symbol2 = scanner.nextInt();
        int symbol3 = scanner.nextInt();
        scanner.close();

        int len = object.length();
        if (symbol1 > len || symbol2 > len || symbol3 > len) {
            System.out.println("Ваши желания превышают наши возможности!");
            return;
        }

        char result1 = object.charAt(symbol1 - 1);
        char result2 = object.charAt(symbol2 - 1);
        char result3 = object.charAt(symbol3 - 1);

        System.out.println("Символ #" + symbol1 + ": " + result1);
        System.out.println("Символ #" + symbol2 + ": " + result2);
        System.out.println("Символ #" + symbol3 + ": " + result3);

    }
}
