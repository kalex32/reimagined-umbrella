package OverrideMethods;
// В существующий класс параллелепипед добавить конструктор, который в качестве параметра будет принимать объект.
//Конструктор используемый при указании всех размеров.
//Конструктор  используемый если не один из размеров не указан - использовать -1 для обозначения неинициализированного параллелепипеда.
//А также конструктор используемый при создании куба.
//Создать параллелепипеды используя разные конструкторы(клона тоже).
//Получить объем первого и второго параллелепипеда.
//Получить объем куба.
//ПОлучить объем клона.

class Brick2 {
    private int a, b, c;
    int volume;

    Brick2(Brick2 brick2) {
        a = brick2.a;
        b = brick2.b;
        c = brick2.c;
        volume = brick2.volume;
    }

    Brick2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        volume = a * b * c;

    }

    Brick2() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        volume = a * b * c;
    }

    Brick2(int a) {
        this.a = this.b = this.c = a;
        volume = (int) Math.pow(a, 3);
    }
    // Вернуть логическое значение true, если параметр ob определяет тот же параллелепипед.
    // использование объектного типа

    boolean sameBrick(Brick2 brick) {
        return ((brick.a == a) & (brick.b == b) & (brick.c == c));
    }

    // Вернуть логическое значение true, если параметр ob определяет параллелепипед того же объема.

    boolean sameVolume(Brick2 brick) {
        return (brick.volume == volume);
    }
}

class BrickRunner2 {
    public static void main(String[] args) {
        Brick2 brick1 = new Brick2(10, 2, 5);
        Brick2 brick2 = new Brick2(brick1);
        Brick2 brick3 = new Brick2();
        Brick2 brick4 = new Brick2(4);

        System.out.println("brick1 имеет те же размеры, что и brick2: " + brick1.sameBrick(brick2));
        System.out.println("brick2 имеет те же размеры, что и brick3: " + brick2.sameBrick(brick3));
        System.out.println("brick1 имеет тот же объем, что и brick3: " + brick1.sameVolume(brick3));

        System.out.println("brick1 имеет объем: " + brick1.volume);
        System.out.println("brick2 имеет объем: " + brick2.volume);
        System.out.println("brick3 имеет объем: " + brick3.volume);
        System.out.println("brick4 имеет объем: " + brick4.volume);
    }
}
