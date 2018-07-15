package Transport;

class Coupe extends RollingStock {

    private int capacityPassengersCoupe;
    private double capacityBaggageCoupe;


    Coupe() {
        super();
        super.setComfortClass(2);
        super.setName("Купейный вагон");
        this.capacityPassengersCoupe = 38;
        this.capacityBaggageCoupe = 1400;
    }

    public int getCapacityPassengersCoupe() {
        return capacityPassengersCoupe;
    }

    public double getCapacityBaggageCoupe() {
        return capacityBaggageCoupe;
    }
}
