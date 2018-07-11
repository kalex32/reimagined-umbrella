package Inheritance_DZ2.Fauna;

class DomesticAnimal extends Running {
    private String name;

    DomesticAnimal() {
        super();
        this.name = "name";
    }


    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void domAnimal(String name) {
        System.out.println("Domestic animal " + name + " lives with a man.");
    }
}
