public class ArrOdd {
    public static void main(String[] args) {
        // Определяем размер массива
        int a = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) a++;
        }
        System.out.println ("Размер массива - " + a);

        // Заполняем массив
        int[] odd = new int[a];
        int j = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                odd[j] = i;
                System.out.print (odd[j] + "; ");
                j++;
            }
        }
        System.out.println ( );
        System.out.println ( );

        // Разворачиваем массив в консоли
        for (int i = odd.length - 1; i >= 0; i--) {
            System.out.print (odd[i] + "; ");
        }
    }
}
