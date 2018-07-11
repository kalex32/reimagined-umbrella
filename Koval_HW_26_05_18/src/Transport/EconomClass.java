package Transport;

class EconomClass extends RollingStock{

    private int capacityPassengersEconomClass;
    private double capacityBaggageEconomClass;

    EconomClass(int comfortClass, String name) {
        super();
        this.capacityPassengersEconomClass = 54;
        this.capacityBaggageEconomClass = 2000;
    }

    public int getCapacityPassengersEconomClass() {
        return capacityPassengersEconomClass;
    }

    public double getCapacityBaggageEconomClass() {
        return capacityBaggageEconomClass;
    }
}
