package Inheritance_DZ2.Sleeping;

import java.time.LocalTime;

class Son extends Father {


    Son(LocalTime startSleep, LocalTime endSleep) {
        super(startSleep, endSleep);
    }


    void sleepingSon(LocalTime time) {
        if ((time.compareTo(getStartSleep()) > 0) && (time.compareTo(getEndSleep()) < 0)) {
            System.out.println("Сынок спит");
        } else System.out.println("Сынуля не спит");
    }
}
