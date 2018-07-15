package String_DZ;

import java.util.Scanner;

public class Hello {
    // Составить программу, которая запрашивает имя пользователя и выводит его на экран с приветствием.

    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, Ваше имя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        String hello = "Приветствуем Вас, ";

        System.out.println(hello.concat(name)+"!!!");
    }
}
