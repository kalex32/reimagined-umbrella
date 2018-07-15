package Inheritance_DZ2.Fauna;

class Fish extends Swimming {
    private String fish;
    private String fins;

    Fish() {
        this.fish = "fish";
        this.fins = "fins";
    }
    void travel(){
        System.out.println("The "+fish+" move with "+fins+".");
    }
}
