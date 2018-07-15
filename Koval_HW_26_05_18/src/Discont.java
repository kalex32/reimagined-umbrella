import java.util.Scanner;

public class Discont {
    // Написать программу, которая принимает стоимость покупок в магазине и выдает сумму к оплате с учетом следующей скидки:
    //- 0 – 500: нет скидки
    //- 501 – 1000: скидка 10%
    //- 1001 – 2000: скидка 15%
    // - 2001 и более: скидка 20%

    public static void main(String[] args) {
        System.out.println("Введите стоимость покупки:");
        Scanner scanner = new Scanner(System.in);
        double sum = scanner.nextDouble();
        scanner.close();

        if (sum < 501) {
            System.out.println("Стоимость Вашей покупки " + sum + " грн. К оплате: " + sum + " грн.");
        } else if (501 < sum && sum < 1001) {
            System.out.println("Стоимость Вашей покупки " + sum + " грн. К оплате, с учетом скидки 10%: " + sum * 0.9 + " грн.");
        } else if (1001 < sum && sum < 2001) {
            System.out.println("Стоимость Вашей покупки " + sum + " грн. К оплате, с учетом скидки 15%: " + sum * 0.85 + " грн.");
        } else
            System.out.println("Стоимость Вашей покупки " + sum + " грн. К оплате, с учетом скидки 20%: " + sum * 0.8 + " грн.");
    }
}