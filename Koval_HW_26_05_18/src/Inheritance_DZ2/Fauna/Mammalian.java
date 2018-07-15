package Inheritance_DZ2.Fauna;

class Mammalian extends Eating {
    String animal;

    Mammalian() {
        this.animal = "animal";
    }

    void dif(){
        System.out.println("Mammals are different.");
    }
}