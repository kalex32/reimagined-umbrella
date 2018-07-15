import java.util.Scanner;

public class Concat {
    // Напишите программу Java для конкатенации данной строки в конец другой строки.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите первую фразу:");
        String object = scanner.nextLine();
        System.out.println(object);

        System.out.println("Напишите вторую фразу:");
        String object2 = scanner.nextLine();
        System.out.println(object2);
        scanner.close();

        String object3 = object.concat(object2);
        System.out.println(object3);

    }
}