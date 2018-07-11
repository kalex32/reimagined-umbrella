package Override_DZ1;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(65987.45);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, какую операцию Вы желаете произвести, (1 - пополнение счета, 2 - растрата, " +
                "3 - балланс на счету):");

        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Введите сумму для пополнения:");
                account.credit(scanner.nextDouble());
                System.out.println("Остаток на счету: " + account.getBalance());
                break;
            case 2:
                System.out.println("Введите сумму для погулять:");
                account.debit(scanner.nextDouble());
                System.out.println("Остаток на счету: " + account.getBalance());
                break;
            case 3:
                System.out.println("Остаток на счету: " + account.getBalance());
                break;
            default:
                System.out.println("Неправильный выбор!!!");
        }
        scanner.close();
    }
}