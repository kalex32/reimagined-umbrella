public class RecSum {
    // Главная функция вызывает функцию Estimate
    public static void main(String[] args) {
        System.out.println (Estimate ("555"));
    }

    // Функция Estimate вызывает сама себя
    static String Estimate(String str) {
        int sum = 0;

        for (int i = 0; i < str.length ( ); i++) {
            String c = str.substring (i, i + 1); // Получение символов из строки
            sum += Integer.parseInt (c);// Преобразование символа в число
        }
        String newStr = String.valueOf (sum);
        if (newStr.length ( ) > 1) newStr = Estimate (newStr);
        return newStr;
    }
}
