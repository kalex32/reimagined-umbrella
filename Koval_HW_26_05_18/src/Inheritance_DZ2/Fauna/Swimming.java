package Inheritance_DZ2.Fauna;

class Swimming extends Eating {
    String sedge;
    String aquarium;

    Swimming() {
        this.sedge = "sedge";
        this.aquarium = "aquarium";
    }

    void swim(String habitat, String fish) {
        System.out.println("The " + fish + " swimming in the " + habitat+".");
    }
}
