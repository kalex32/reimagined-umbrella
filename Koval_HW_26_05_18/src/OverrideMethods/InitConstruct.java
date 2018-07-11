package OverrideMethods;

class InitConstruct {
    int sum;

    InitConstruct(int num) {
        sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
    }

    InitConstruct(InitConstruct object) {
        sum = object.sum;
    }
}

class InitConstructRun {
    public static void main(String[] args) {
        InitConstruct initConstruct1 = new InitConstruct(6);
        InitConstruct initConstruct2 = new InitConstruct(initConstruct1);

        System.out.println("initConstruct1.sum = " + initConstruct1.sum);
        System.out.println("initConstruct2.sum = " + initConstruct2.sum);
    }
}
