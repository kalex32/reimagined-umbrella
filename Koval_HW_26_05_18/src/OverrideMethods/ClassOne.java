package OverrideMethods;
//Прочитать презентацию, выучить что такое перегрузка методов и конструкторов.
//Переписать все примеры со своими названиями классов, методов и данными. Выслать как домашнее задание.

public class ClassOne {
    String d;

    public ClassOne(String d) {
        this.d = d;
    }

    public static void changeField(ClassOne other) {
        other.d = "*******************";
    }

    public static void changeRef(ClassOne other) {
        other = new ClassOne("----------------");
    }
}

class ClassOneRunner {
    public static void main(String[] args) {
        ClassOne obj1 = new ClassOne("1");
        ClassOne obj2 = new ClassOne("2");

        ClassOne.changeField(obj1);
        ClassOne.changeRef(obj2);

        System.out.println(obj1.d);
        System.out.println(obj2.d);

    }
}
