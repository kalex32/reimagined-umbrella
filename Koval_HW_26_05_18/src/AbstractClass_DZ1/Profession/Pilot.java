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
        return "flies";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pilot ");
        sb.append(getName()).append(' ').append(toDoWork()).append(" on a ").append(getIndustry());
        sb.append("ed cargo plane ").append(getTypeOfAirplane());
        return sb.toString();

    }
}
