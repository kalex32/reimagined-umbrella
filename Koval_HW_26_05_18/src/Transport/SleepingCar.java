package Transport;

class SleepingCar extends RollingStock implements CarsMethods {

    private int capacityPassengersSleepingCar;
    private double capacityBaggageSleepingCar;
    private int availableCars;

    SleepingCar() {
        super();
        super.setComfortClass(1);
        super.setName("СВ");
        this.capacityPassengersSleepingCar = 18;
        this.capacityBaggageSleepingCar = 650;
        this.availableCars= 13;
    }

    int getCapacityPassengersSleepingCar() {
        return capacityPassengersSleepingCar;
    }

    double getCapacityBaggageSleepingCar() {
        return capacityBaggageSleepingCar;
    }

    int getAvailableCars() { return availableCars; }

    @Override
    public int carsCountForPassengers(int passengerCount) {
        if (passengerCount % getCapacityPassengersSleepingCar() == 0) {
            return passengerCount / getCapacityPassengersSleepingCar();
        } else return (passengerCount / getCapacityPassengersSleepingCar()) + 1;
    }

    @Override
    public int carsCountForBaggage(double baggageCount) {
        if (baggageCount % getCapacityBaggageSleepingCar() == 0) {
            return (int) (baggageCount / getCapacityBaggageSleepingCar());
        } else return (int) (baggageCount / getCapacityBaggageSleepingCar()) + 1;
    }
}
