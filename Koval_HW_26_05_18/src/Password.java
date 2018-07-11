import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    // Напишите Java-метод, чтобы проверить, является ли строка допустимым паролем.
    //Правила пароля:
    //пароль должен содержать не менее десяти символов.
    //Пароль состоит только из букв и цифр.
    //Пароль должен содержать не менее двух цифр.
    //Ожидаемый результат:
    //1.Пароль должен содержать не менее восьми символов.                                             
    //2. Пароль состоит только из букв и цифр.                                         
    //3. Пароль должен содержать не менее двух цифр.  
    //
    //Пример                                       
    //Введите пароль (вы соглашаетесь с вышеуказанными Положениями и условиями.): Abcd1234            
    //Пароль действителен: abcd1234

    public static void main(String[] args) {
        System.out.println("Введите пароль, согласно условий: \n" +
                "1.Пароль должен содержать не менее восьми символов.\n" +
                "2. Пароль должен состоять только из букв и цифр.\n" +
                "3. Пароль должен содержать не менее двух цифр.\n");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        doMatch(password);
    }


    public static void doMatch(String password) {
        Pattern pattern = Pattern.compile("^*[a-zA-Z0-9]{8,}.*[0-9].*[0-9].*$");
        Matcher matcher = pattern.matcher(password);
        System.out.println("Пароль: " + password + (matcher.matches() ? " Правильный" : " Не правильный"));

    }
}

