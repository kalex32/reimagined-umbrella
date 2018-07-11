package Inheritance_DZ2.Fauna;

class Flying extends Eating {
    private String sky = "sky";

    Flying(){
    }

    void fly() {
        System.out.println("Flying in the " + sky);
    }
}
