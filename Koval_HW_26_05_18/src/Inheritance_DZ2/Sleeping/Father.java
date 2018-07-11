package Inheritance_DZ2.Sleeping;

import java.time.LocalTime;

class Father {
    // Создать класс Отец и класс Сын. Унаследовать Сына от Отца.
    // У обоих должен быть метод спать, но это не должно быть переопределение метода.

    private LocalTime startSleep;
    private LocalTime endSleep;

    LocalTime getStartSleep() {
        return startSleep;
    }

    LocalTime getEndSleep() {
        return endSleep;
    }


    Father(LocalTime startSleep, LocalTime endSleep) {
        this.startSleep = startSleep;
        this.endSleep = endSleep;
    }

    void sleepingFather(LocalTime time) {
        if ((time.compareTo(startSleep) > 0) && (time.compareTo(endSleep) < 0)) {
            System.out.println("Папаша спит");
        } else System.out.println("Предок не спит");
    }
}
