package String_DZ;

import java.util.Scanner;

public class LetterE {
    // Запросить у пользователя текст на английском языке.
    // Найти сколько раз в тексте встречается буква e (без учета регистра)
    // и на каких позициях они стоят (индексы).

    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, текст на английском языке!");
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text = text1.toLowerCase();
        int anyWhereIndex = text.indexOf('e');
        if (anyWhereIndex == -1) {
            System.out.println("Нет такой буквы в Вашем тексте!");
            return;
        }
        int index = 0;
        int count = 0;

        System.out.println("Буква 'е', встречается в Вашем тексте на позициях: ");
        for (int i = 0; i < text.length(); i = index + 1) {
            index = text.indexOf('e', i);
            if (index == -1) break;
            count++;
            System.out.print(index + ", ");
        }
        System.out.println();
        System.out.println("Всего буква'e' встречается в Вашем тексте - " + count + " раз.");
    }
}