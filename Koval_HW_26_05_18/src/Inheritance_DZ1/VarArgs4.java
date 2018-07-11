package Inheritance_DZ1;

public class VarArgs4 {
    static void vaTesr(int... v) {
    }

    static void vaTest(boolean... v) {
    }

    static void vaTest(int i, int...v){
    }

    public static void main(String[] args) {
        vaTesr(1,2,3,4);
        vaTest(false,true,true);
        vaTest();
        vaTest(1);
    }
}
