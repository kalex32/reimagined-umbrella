package Inheritance_DZ1;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("male");
        Student student2 = new Student("female");
        Student student3 = new Student("male");

        student1.setName("Федор");
        student2.setName("Ганна");
        student3.setName("John");

        student1.setAge(21);
        student2.setAge(22);
        student3.setAge(23);

        student1.setWeight(76.5);
        student2.setWeight(56.3);
        student3.setWeight(98);

        student1.setTerm(2);
        student2.setTerm(1);
        student3.setTerm(4);

        student1.changeTerm(1);
        student2.changeTerm(2);
        student3.changeTerm(3);
    }
}
