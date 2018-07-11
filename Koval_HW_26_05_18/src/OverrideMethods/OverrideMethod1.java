package OverrideMethods;

class OverrideMethod1 {

    void overDemo() {
        System.out.println("Без параметров");
    }

    void overDemo(int a) {
        System.out.println("Один параметр: " + a);
    }

    int overDemo(int a, int b) {
        System.out.println("Два параметра: " + a + ", " + b);
        return a + b;
    }

    double overDemo(double a, double b) {
        System.out.println("Два параметра, типа double: " + a + ", " + b);
        return a + b;

    }
}

class OverMethRunner {
    public static void main(String[] args) {
        OverrideMethod1 ovMethod1 = new OverrideMethod1();
        int resultI;
        double resultD;

        ovMethod1.overDemo();
        System.out.println();
        ovMethod1.overDemo(2);
        System.out.println();
        resultI = ovMethod1.overDemo(4, 6);
        System.out.println("результат вызова ovMethod1.overDemo(4, 6): " + resultI);
        System.out.println();
        resultD = ovMethod1.overDemo(1.1, 2.32);
        System.out.println("результат вызова ovMethod1.overDemo(1.1, 2.32): " + resultD);
    }
}