import java.util.Scanner;

public class Contains {
    //Напишите программу Java, чтобы проверить, содержит ли указанная строка указанную последовательность значений символов.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите фразу:");
        String object = scanner.nextLine();
        System.out.println(object);

        System.out.println("Напишите искомую последовательность:");
        String object2 = scanner.nextLine();
        System.out.println(object2);

        if (object.contains(object2)) {
            System.out.println("Введенная Вами фраза содержит искомую Вами же последовательность.УРА!!!");
        } else System.out.println("В введенной Вами фразе отсутсвует искомая Вами же последовательность.:((((");
    }
}
