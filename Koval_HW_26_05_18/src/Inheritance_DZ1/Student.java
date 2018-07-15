package Inheritance_DZ1;

class Student extends Man {
    private int term;

    Student(String sex) {
        super(sex);
    }

    void setTerm(int term) {
        this.term = term;
    }

    void changeTerm(int newTerm) {
        this.term = newTerm;
    }
}
