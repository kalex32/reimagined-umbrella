public class Koval_HW2 {

    public static void main(String[] args) {
        // 1.
        int a = 0;
        for (int b = 1; b <= 99; b++) {
            if (b % 2 != 0) a++;
        }
        System.out.println("Размер имеет значение = " + a);
        int odd[] = new int[a];
        for (int c = 1, d = 0; c <= 99; c++) {
            if (c % 2 != 0) {
                odd[d] = c;
                System.out.print(odd[d] + "; ");
                d++;
            }
        }
        System.out.println();
        for (int e = odd.length - 1; e >= 0; e--) {
            System.out.print(odd[e] + "; ");
        }
        System.out.println();
        System.out.println();

        // 2.
        int fibo[] = new int[20];
        for (int f = 0; f <fibo.length; f++) {
            if (f <= 1) {
                fibo[f] = 1;
            } else {
                fibo[f] = fibo[f - 1] + fibo[f - 2];
            }
            System.out.print(fibo[f] + "; ");
        }
        System.out.println();
        System.out.println();

        // 3.
        int two_d[][] = new int[8][5];
        for (int g = 0; g < two_d.length; g++) {
            for (int h = 0; h < two_d[g].length; h++) {
                two_d[g][h] = 10 + (int) (Math.random() * 90);
                System.out.print(two_d[g][h] + " ");
            }
            System.out.println();
        }
    }
}