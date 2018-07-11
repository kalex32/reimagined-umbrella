package String_DZ;

import java.util.Scanner;

public class Word {
    // Дано слово. Все данные в задании запрашиваем у пользователя. Вывести на экран:
    //Его третий символ
    //Его последний символ
    //Вывести на экран его k-символ
    //Посчитать сколько раз встречается m-символ

    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, слово:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        System.out.println("Третий символ в Вашем слове - " + word.charAt(2));
        System.out.println("Последний символ в Вашем слове - " + word.charAt(word.length() - 1));

        System.out.println("Какой по счету символ Вы желаете вывести на экран?");
        int k = scanner.nextInt();
        if (k > 0 & k <= word.length()) System.out.println(k + " символ в Вашем слове - " + word.charAt(k - 1));
        else System.out.println("Буквы с таким номером в Вашем слове нет!");

        System.out.println("Выберите, какой символ Вы желаете посчитать");
        String m1 = scanner.next();
        String s = m1.substring(0, 1);
        int anyWhereIndex = word.indexOf(s);
        if (anyWhereIndex == -1) {
            System.out.println("Ничего такого не обнаружено!");
            return;
        }
        int index;
        int count = 0;
        for (int i = 0; i < word.length(); i = index + 1) {
            index = word.indexOf(s, i);
            if (index == -1) break;
            count++;
        }
        System.out.println("Введенный Вами символ встречается в Вашем же слове - " + count + " раз");
    }
}
