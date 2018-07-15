import java.util.Scanner;

public class StartWith {
    // Напишите программу Java, чтобы проверить, начинается ли заданная строка с содержимым другой строки.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите строку:");
        String object = scanner.nextLine();
        System.out.println(object);

        System.out.println("Напишите искомую последовательность в начале строки:");
        String object2 = scanner.nextLine();
        System.out.println(object2);

        if (object.startsWith(object2)){
            System.out.println("Да, строка начинается с искомой комбинации символов!!!");
        } else System.out.println("Нет, искомой комбинации не найдено в начале строки :((((");
    }
}
