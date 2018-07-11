package Inheritance_DZ2.Fauna;

class Running extends Mammalian {

    private String forward;

    Running() {
        super();
        this.forward = "forward";

    }

    void run(String animal) {
        System.out.println(animal + " ran " + forward);
    }
}
