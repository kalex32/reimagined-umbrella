package Inheritance_DZ2.Fauna;

class Jumping extends Mammalian {

    private String up;

    Jumping() {
        super();
        this.up="up";
    }

    void jump() {
        System.out.println(animal+" jumps " + up);
    }
}
