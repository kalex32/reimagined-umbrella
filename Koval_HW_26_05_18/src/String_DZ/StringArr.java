package String_DZ;

import java.util.Scanner;

public class StringArr {
    // Дан массив строк. Вывести те из них, которые начинаются на одну букву (без учета регистра)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите " + 5 + " строк:");
        String[] arr = new String[5];
        String[] arrL = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
            arrL[i] = arr[i].substring(0, 1);
        }
        for (int i = 0; i < arrL.length; i++) {
            for (int j = arrL.length - 1; j > i; j--) {
                if (arrL[i].compareToIgnoreCase(arrL[j]) == 0) {
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                    System.out.println();
                }
            }
        }
    }
}
