import java.util.Scanner;

public class ScanEx {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println ("Введите логин:");
        String login = input.nextLine ( );
        System.out.println ("Введите пароль:");
        int password = input.nextInt ( );

        if (login.equals ("admin") && password == 12345) {
            System.out.println ("Ввод верный");
        } else {
            System.out.println ("Вы ввели неправильный логин и/или пароль");
        }
    }
}
