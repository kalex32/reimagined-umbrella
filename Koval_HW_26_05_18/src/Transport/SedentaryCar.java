package Transport;

class SedentaryCar extends RollingStock{

    private int capacityPassengersSedentaryCar;
    private double capacityBaggageSedentaryCar;

    SedentaryCar(int comfortClass, String name) {
        super();
        this.capacityPassengersSedentaryCar = 90;
        this.capacityBaggageSedentaryCar = 3300;
    }

    public int getCapacityPassengersSedentaryCar() {
        return capacityPassengersSedentaryCar;
    }

    public double getCapacityBaggageSedentaryCar() {
        return capacityBaggageSedentaryCar;
    }
}
