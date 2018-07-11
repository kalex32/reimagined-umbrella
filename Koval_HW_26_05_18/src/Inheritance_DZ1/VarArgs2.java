package Inheritance_DZ1;

public class VarArgs2 {
    private static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length);
        System.out.println("Содержимое: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("arg" + i + ". " + v[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest("Один аргумент ", 1);
        vaTest("Два аргумента ", 1, 2);
        vaTest("Без аргументов ");
    }
}
