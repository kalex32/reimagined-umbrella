package Inheritance_DZ1;

public class VarArgs3 {
    private static void vaTest(int... v) {
        System.out.println("vaTest(int...v) количество аргументов: " + v.length);
        System.out.println("Содержимое: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("arg" + i + ". " + v[i]);
            System.out.println();
        }
    }

    static void vaTest(boolean... v) {
        System.out.println("Содержимое: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("arg" + i + ". " + v[i]);
            System.out.println();
        }
    }

    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length);
        System.out.println("Содержимое: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("arg" + i + ". " + v[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Тестирование", 10, 20, 30);
        vaTest(false, true, false, false);
    }
}
