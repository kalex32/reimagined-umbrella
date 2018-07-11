package Inheritance_DZ1;

import static Inheritance_DZ1.VariableLengthArgs.vaTest;

class VariableLengthArgs {
    static void vaTest(int... v){
        System.out.println("Число аргументов: "+v.length);
        System.out.println("Содержимое: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("arg"+i+"."+v[i]);
            System.out.println();
        }
    }
}
class VariableLengthArgsTest{
    public static void main(String[] args) {
        vaTest(1);
        vaTest(1,2,3,4,5,6);
        vaTest();
    }
}
