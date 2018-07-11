import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;

public class PopularLetter {
    // Дан текст, который содержит различные английские буквы и знаки препинания.
    // Вам необходимо найти самую частую букву в тексте.
    // Результатом должна быть буква в нижнем регистре.

    public static void main(String[] args) {
        System.out.println("Введите текст на английском языке:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();


        // Переводим буквы в нижний регистр
        String lowerText = text.toLowerCase();
        char[] letter = lowerText.toCharArray();
        //System.out.println(Arrays.toString(letter));


        //Загоняем алфавит в массив, а также отсекаем все ненужное для поиска
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();


        // Счетчик количества встреченных букв, количество загоняем в массив.
        ArrayList<Integer> counter = new ArrayList<>();
        for (Character character : abcArray) {
            int count = 0;
            for (int i = 0; i < letter.length; i++) {
                if (letter[i] == character) {
                    count++;
                }
            }
            counter.add(count);
            //System.out.print(character + "-" + count + " ");
        }
        //System.out.println();
        //System.out.println(counter);


        // Находим индекс максимально повторяющейся буквы. При равных количествах, индекс принадлежит первой по алфавиту
        Integer[] counter1 = new Integer[counter.size()];
        counter.toArray(counter1);
        int indexCounter1Max = 0;
        for (int i = 1; i < counter1.length; i++) {
            if (counter1[i] > counter1[indexCounter1Max]) {
                indexCounter1Max = i;
            }
        }
        System.out.println("Наиболее встречающаяся буква во введенном тексте: " + abcArray[indexCounter1Max]);
        System.out.println("Количество повторов: " + counter1[indexCounter1Max]);
    }
}