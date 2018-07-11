package Transport2;

class PassengerTrain implements Train{

    private String nameOfTrain;

    PassengerTrain(){
        this.nameOfTrain="Пассажирский поезд";
    }

    public String getNameOfTrain() {
        return nameOfTrain;
    }

    RollingStock[] passengerTrain = {
            new SedentaryCar(),
            new SedentaryCar(),
            new CouchetteCar(),
            new CouchetteCar(),
            new CouchetteCar(),
            new SedentaryCar(),
            new SedentaryCar(),
            new Coupe(),
            new Coupe(),
            new SleepingCar(),
            new SedentaryCar(),
            new SedentaryCar(),
            new Coupe()
    };

    @Override
    public int countOfPassengersTrain(RollingStock[] passengerTrain) {
        int countOfPassengers = 0;
        for (int i = 0; i < passengerTrain.length; i++) countOfPassengers += passengerTrain[i].getAmountOfPassengersCar();
        return countOfPassengers;

    }

    @Override
    public double countOfBaggageTrain(RollingStock[] passengerTrain) {
        int countOfBaggage = 0;
        for (int i = 0; i < passengerTrain.length; i++) countOfBaggage += passengerTrain[i].getBaggageWeight();
        return countOfBaggage;
    }
}
