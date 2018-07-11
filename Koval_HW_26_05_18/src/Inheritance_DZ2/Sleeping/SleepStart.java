package Inheritance_DZ2.Sleeping;

import java.time.LocalTime;

public class SleepStart {
    public static void main(String[] args) {
        Father father = new Father(LocalTime.of(00, 01), LocalTime.of(7, 28));
        Son son =new Son(LocalTime.of(02, 00), LocalTime.of(10, 00));

        LocalTime time = LocalTime.of(1,59);
        father.sleepingFather(time);
        son.sleepingSon(time);
    }
}
