package Inheritance_DZ2.Fauna;

public class FaunaRun {
    public static void main(String[] args) {
        Cat cat = new Cat("cat", "Murzik");
        Dog dog = new Dog("dog", "Druzhok");
        Mammalian mammalian = new Mammalian();
        DomesticAnimal domesticAnimal = new DomesticAnimal();
        domesticAnimal.setName("Serg");

        System.out.println("Domestic animal " + domesticAnimal.getName() + " is a hamster.");
        domesticAnimal.domAnimal(domesticAnimal.getName());

        System.out.println("Cat " + cat.getName() + " miaow!");
        cat.eat(cat.getName(), "fish");
        System.out.println("Dog " + dog.getName() + " bow-wow!");
        dog.eat(dog.getName(), "bone");

        Swimming swimming = new Swimming();
        Fish fish = new Fish();
        Pike pike = new Pike();
        Goldfish goldfish = new Goldfish();
        pike.swim(swimming.sedge, pike.name);
        goldfish.swim(swimming.aquarium, goldfish.name);
        fish.travel();
        mammalian.dif();

        Flying flying = new Flying();
        Jumping jumping = new Jumping();
        Running running = new Running();

        running.run(dog.getName());
        jumping.jump();
        flying.fly();


    }
}
