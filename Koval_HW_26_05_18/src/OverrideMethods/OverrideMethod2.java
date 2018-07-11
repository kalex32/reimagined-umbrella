package OverrideMethods;

// Автоматическое преобразование типов может влиять на выбор перегружаемого метода
public class OverrideMethod2 {
    void j(int x) {
        System.out.println("Внутри j(int):" + x);
    }

    void j(double x) {
        System.out.println("Внутри j(double):" + x);
    }
}

class OverrideMethodRunner1 {
    public static void main(String[] args) {
        OverrideMethod2 overrideMethod2 = new OverrideMethod2();

        int i = 10;
        double d = 10.1;
        byte b = 127;
        short s = 11;
        float f = 11.5f;

        overrideMethod2.j(i);
        overrideMethod2.j(d);
        overrideMethod2.j(b);
        overrideMethod2.j(s);
        overrideMethod2.j(f);
    }
}
