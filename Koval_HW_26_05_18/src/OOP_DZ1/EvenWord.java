package OOP_DZ1;

import java.util.Scanner;

public class EvenWord {
    // Пользователь вводит слово. Сделать проверку на то чтобы слово состояло из четного числа букв.
    // Поменять местами его половины.

    private static boolean even(String word) {
        return word.length() % 2 == 0;
    }

    private static void change(String word) {
        String word2 = word.substring(word.length() / 2, word.length()).concat(word.substring(0, word.length() / 2));
        System.out.println("Так как количество букв четно, результате получается слово: " + word2);
    }

    public static void main(String[] args) {
        System.out.println("Напишите, пожалуйста, слово:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if (even(word)) change(word);
        else System.out.println("Количество букв в Вашем слове не является четным!");
    }
}
