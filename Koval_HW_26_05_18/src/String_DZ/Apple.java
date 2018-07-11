package String_DZ;

public class Apple {
    // Из слова яблоко путем «вырезок» получить слова блок и око.

    public static void main(String[] args) {
        String apple = "яблоко";
        System.out.println(apple);

        String block = apple.substring(1, 5);
        System.out.println(block);

        String eye = apple.substring(3);
        System.out.println(eye);
    }
}
