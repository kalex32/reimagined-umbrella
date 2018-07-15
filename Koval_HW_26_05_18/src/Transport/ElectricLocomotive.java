package Transport;

class ElectricLocomotive extends RollingStock {

    private double speedElectricLocomotive;


    ElectricLocomotive(int carriageCount) {
        super(carriageCount);
        this.speedElectricLocomotive=100;
    }

    public double getSpeedElectricLocomotive() {
        return speedElectricLocomotive;
    }
}
