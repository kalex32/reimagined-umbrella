package AbstractClass_DZ2;

class Xiaomi extends SmartPhone {
    private String markPhone;

    Xiaomi(String os, double diagonalOfDisplay, int amountOfSim, int ram, int rom, int capacityOfAccum, int megapicOfCam,
           String markPhone) {
        super(os, diagonalOfDisplay, amountOfSim, ram, rom, capacityOfAccum, megapicOfCam);
        this.markPhone = markPhone;
    }

    String getMarkPhone() {
        return markPhone;
    }

//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("Xiaomi{");
//        sb.append("markPhone='").append(markPhone).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }
}
