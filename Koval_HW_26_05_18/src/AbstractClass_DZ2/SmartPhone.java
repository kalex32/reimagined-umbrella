package AbstractClass_DZ2;

abstract class SmartPhone implements MobilePhones {
    private String os;
    private double diagonalOfDisplay;
    private int amountOfSim;
    private int ram;
    private int rom;
    private int capacityOfAccum;
    private int megapicOfCam;


    SmartPhone(String os, double diagonalOfDisplay, int amountOfSim, int ram, int rom, int capacityOfAccum, int megapicOfCam) {

        this.os = os;
        this.diagonalOfDisplay = diagonalOfDisplay;
        this.amountOfSim = amountOfSim;
        this.ram = ram;
        this.rom = rom;
        this.capacityOfAccum = capacityOfAccum;
        this.megapicOfCam = megapicOfCam;
    }

    String getOs() {
        return os;
    }

    double getDiagonalOfDisplay() {
        return diagonalOfDisplay;
    }

    int getAmountOfSim() {
        return amountOfSim;
    }

    int getRam() {
        return ram;
    }

    int getRom() {
        return rom;
    }

    int getCapacityOfAccum() {
        return capacityOfAccum;
    }

    int getMegapicOfCam() {
        return megapicOfCam;
    }



//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("SmartPhone{");
//        sb.append("os='").append(os).append('\'');
//        sb.append(", diagonalOfDisplay=").append(diagonalOfDisplay);
//        sb.append(", amountOfSim=").append(amountOfSim);
//        sb.append(", ram=").append(ram);
//        sb.append(", rom=").append(rom);
//        sb.append(", capacityOfAccum=").append(capacityOfAccum);
//        sb.append(", megapicOfCam=").append(megapicOfCam);
//        sb.append('}');
//        return sb.toString();
//    }
}
