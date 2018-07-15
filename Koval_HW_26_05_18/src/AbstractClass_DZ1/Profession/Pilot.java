package AbstractClass_DZ1.Profession;

class Pilot extends Profession {
    private String typeOfAirplane;

    Pilot(String name, String industry, String typeOfAirplane) {
        super(name, industry);
        this.typeOfAirplane = typeOfAirplane;
    }

    String getTypeOfAirplane() {
        return typeOfAirplane;
    }

    @Override
    String toDoWork() {
        return null;
    }
}
