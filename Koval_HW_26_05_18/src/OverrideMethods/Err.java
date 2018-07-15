package OverrideMethods;

class Err {
    String message;
    int levelErr;

    Err(String m, int l) {
        message = m;
        levelErr = l;
    }
}

class ErrMessage1 {
    private String[] msges = {
            "Ошибка ввода",
            "Ошибка вывода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };
    private int[] WhatHap = {1, 2, 3, 4};

    Err getErrMessages(int i) {
        if (i >= 0 & i < msges.length) return new Err(msges[i], WhatHap[i]);
        else return new Err("Несуществующий код ошибки", 0);
    }
}

class ErrMsgRun {
    public static void main(String[] args) {
        ErrMessage1 errMessage1 = new ErrMessage1();
        Err e;
        e = errMessage1.getErrMessages(2);
        System.out.println(e.message + ", уровень: " + e.levelErr);
        e = errMessage1.getErrMessages(22);
        System.out.println(e.message + ", уровень: " + e.levelErr);


    }
}