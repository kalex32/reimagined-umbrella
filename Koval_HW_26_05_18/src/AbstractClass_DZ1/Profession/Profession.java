package AbstractClass_DZ1.Profession;

abstract class Profession {
    private String name;
    private String industry;

    Profession(String name, String industry) {
        this.name = name;
        this.industry = industry;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getIndustry() {
        return industry;
    }

    void setIndustry(String industry) {
        this.industry = industry;
    }

    abstract String toDoWork();
}
