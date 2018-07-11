package OverloadConstruct;

import static OverloadConstruct.TheStoreAccount.monthPercent;

public class TheStoreAccountTest {
    public static void main(String[] args) {
        TheStoreAccount saver1 = new TheStoreAccount(2000);
        TheStoreAccount saver2 = new TheStoreAccount(3000);
        TheStoreAccount.setAnnualRate(3.9);
        System.out.println("Ежемесячный процент по Вашему вкладу " + saver1.getBalance() + " составляет " +
                monthPercent() + "%");
        System.out.println("Через месяц Ваш вклад " + saver1.getBalance() + " увеличится на "
                + saver1.getBalance() / 100 * monthPercent() + " и составит " + (saver1.getBalance() +
                (saver1.getBalance() / 100 * monthPercent())));

        System.out.println("Ежемесячный процент по Вашему вкладу " + saver2.getBalance() + " составляет " +
                monthPercent() + "%");
        System.out.println("Через месяц Ваш вклад " + saver2.getBalance() + " увеличится на "
                + saver2.getBalance() / 100 * monthPercent() + " и составит " + (saver2.getBalance() +
                (saver2.getBalance() / 100 * monthPercent())));


        TheStoreAccount.setAnnualRate(5);
        System.out.println("Ежемесячный процент по Вашему вкладу " + saver1.getBalance() + " составляет " +
                monthPercent() + "%");
        System.out.println("Через месяц Ваш вклад " + saver1.getBalance() + " увеличится на "
                + saver1.getBalance() / 100 * monthPercent() + " и составит " + (saver1.getBalance() +
                (saver1.getBalance() / 100 * monthPercent())));

        System.out.println("Ежемесячный процент по Вашему вкладу " + saver2.getBalance() + " составляет " +
                monthPercent() + "%");
        System.out.println("Через месяц Ваш вклад " + saver2.getBalance() + " увеличится на "
                + saver2.getBalance() / 100 * monthPercent() + " и составит " + (saver2.getBalance() +
                (saver2.getBalance() / 100 * monthPercent())));
    }
}
