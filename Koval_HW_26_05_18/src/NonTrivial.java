import java.util.ArrayList;
import java.util.Scanner;

public class NonTrivial {
    // Напишите программу, которая ищет и выводит на экран все простые нетривиальные делители числа,
    // введённого пользователем с клавиатуры, начиная с наибольшего из делителей, либо сообщает,
    // что введённое число — является простым.

    public static void main(String[] args) {
        System.out.println("Введите натуральное число:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> list = new ArrayList<>();
        if (num > 0) {
            for (int i = num - 1; i > 1; i--) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                    list.add(i);
                }
            }
        } else {
            System.out.println("Вы ввели отрицательное число!");
            return;
        }

        if (list.size() == 0) System.out.println("Вы ввели простое число!!!");
    }
}
