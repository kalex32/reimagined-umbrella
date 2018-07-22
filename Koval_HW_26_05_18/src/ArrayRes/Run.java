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
        try {
            if (index>arrayRes.getArrayR().length-1){
                arrayRes.arrayInsert(value, index);
                arrayRes.arrayPrint(arrayRes.getArrayR());
            }

        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Выход за пределы массива");
        }

    }
}
