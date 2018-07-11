package OOP_DZ1;

//import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Numbers {
    //Пользователь вводит текст, в котором имеются несколько идущих подряд цифр.
    // Написать метод, который получает число, образованное этими цифрами
    // (сделать проверку на наличие цифр в тексте, вывести первые идущие подряд цифры, остальные не нужно).

    private static void ver(String text) {
        Pattern p = Pattern.compile("(.*)(\\d{2,})(.*)");
        Matcher m = p.matcher(text);
        if (m.lookingAt()) {
            String[] text1 = text.split("[\\D]+");
//            System.out.println(Arrays.toString(text1));
//            System.out.println();
//            System.out.println(text1.length);
            Integer[] num = new Integer[text1.length];
            for (int i = 0; i < num.length; i++) {
                if (text1[i].equals("")){
                    num[i]=0;
                    i++;
                }
                num[i] = Integer.parseInt(text1[i]);
                if (num[i] > 9){
                    System.out.println(num[i]);
                    break;
                }
            }
            //System.out.println(Arrays.toString(num));
        } else System.out.println("NO");
    }

    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, текст");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        ver(text);
    }
}
