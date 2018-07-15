import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    // Напишите Java программу для создания массива символов, содержащего содержимое строки.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите строку:");
        String object = scanner.nextLine();
        System.out.println(object);

        char[] stringArray = object.toCharArray();
        System.out.println(Arrays.toString(stringArray));
    }
}
