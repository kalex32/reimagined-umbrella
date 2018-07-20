package ArrayRes;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива:");
        Scanner scanner = new Scanner(System.in);
        ArrayRes arrayRes = new ArrayRes(scanner.nextInt());
        System.out.println("Введите значение элемента:");
        int value = scanner.nextInt();
        System.out.println("Введите индекс элемента:");
        int index = scanner.nextInt();

        arrayRes.arrayInsert(value, index);
        arrayRes.arrayPrint(arrayRes.getArrayR());
    }
}
