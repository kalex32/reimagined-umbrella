package AbstractClass_DZ1.Profession;

class Developer extends Profession {
    private String speciality;

    Developer(String name, String industry, String speciality) {
        super(name, industry);
        this.speciality = speciality;
    }

    String getSpeciality() {
        return speciality;
    }

    @Override
    String toDoWork() {
        return null;
    }
}
