package OverrideMethods;

class OverrideConstruct {
    int x;

    OverrideConstruct() {
        System.out.println("Внутри OverrideConstruct(). ");
        x = 0;
    }

    OverrideConstruct(int i) {
        System.out.println("Внутри OverrideConstruct(int). ");
        x = i;
    }

    OverrideConstruct(double d) {
        System.out.println("Внутри OverrideConstruct(double). ");
        x = (int) d;
    }

    OverrideConstruct(int y, int z) {
        System.out.println("Внутри OverrideConstruct(int, int). ");
        x = y * z;
    }
}

class OverrideConstructRun {
    public static void main(String[] args) {

        OverrideConstruct overrideConstruct1 = new OverrideConstruct();
        OverrideConstruct overrideConstruct2 = new OverrideConstruct(65);
        OverrideConstruct overrideConstruct3 = new OverrideConstruct(4.789);
        OverrideConstruct overrideConstruct4 = new OverrideConstruct(56, 87);

        System.out.println("overrideConstruct1.x = " + overrideConstruct1.x);
        System.out.println("overrideConstruct2.x = " + overrideConstruct2.x);
        System.out.println("overrideConstruct3.x = " + overrideConstruct3.x);
        System.out.println("overrideConstruct4.x = " + overrideConstruct4.x);
    }

}
