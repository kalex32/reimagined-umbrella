package String_DZ;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StrCount {
    // Дано предложение. Определить кол-во слов в предложении.

    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, предложение:");
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(text1);
        System.out.println("Количество слов в введенном предложении: "+stringTokenizer.countTokens());
    }
}