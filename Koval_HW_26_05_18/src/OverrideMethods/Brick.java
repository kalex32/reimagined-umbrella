package OverrideMethods;

public class Brick {
    private int a, b, c;
    private int volume;

    public Brick(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        volume = a * b * c;
    }
    // Вернуть логическое значение true, если параметр ob определяет тот же параллелепипед.
    // использование объектного типа

    boolean sameBrick(Brick brick){
        if ((brick.a == a)&(brick.b==b)&(brick.c==c)) return true;
        else {
            return false;
        }
    }

    // Вернуть логическое значение true, если параметр ob определяет параллелепипед того же объема.

    boolean sameVolume(Brick brick){
        if (brick.volume==volume){
            return true;
        } else {
            return false;
        }
    }
}

class BrickRunner{
    public static void main(String[] args) {
        Brick brick1=new Brick(10,2,5);
        Brick brick2=new Brick(10,2,5);
        Brick brick3=new Brick(4,5,5);

        System.out.println("brick1 имеет те же размеры, что и brick2: "+brick1.sameBrick(brick2));
        System.out.println("brick2 имеет те же размеры, что и brick3: "+brick2.sameBrick(brick3));
        System.out.println("brick1 имеет тот же объем, что и brick3: "+brick1.sameVolume(brick3));

    }
}
