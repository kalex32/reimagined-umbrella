package Inheritance_DZ1;

public class Man {
    // Создать класс Man (человек), с полями: имя, возраст, пол и вес.
    // Определить методы задания имени, возраста и веса.
    //Создать производный класс Student, имеющий поле года обучения.
    // Определить методы задания и увеличения года обучения.

    private String name;
    private int age;
    private String sex;
    private double weight;

    Man(String sex) {
        this.sex = sex;

    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }
}
