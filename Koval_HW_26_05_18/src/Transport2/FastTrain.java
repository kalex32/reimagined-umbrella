package Transport2;

class FastTrain implements Train {

    private String nameOfTrain;

    FastTrain() {
        this.nameOfTrain = "Скорый поезд";
    }

    RollingStock[] fastTrain = {
            new Coupe(),
            new SleepingCar(),
            new SedentaryCar(),
            new SedentaryCar(),
            new CouchetteCar(),
            new CouchetteCar(),
            new Coupe(),
            new Coupe(),
            new SleepingCar(),
            new Coupe()
    };

    void sorting() {
        sortingByComfortClass(fastTrain);
        System.out.println("Сортировка " + getNameOfTrain() + " на основе уровня комфортности:");

        for (int i = 0; i < fastTrain.length; i++) {
            System.out.println("Вагон №" + (i + 1) + ", класс комфорта: " + fastTrain[i].getComfortClassCar() +
                    ", наименование: " + fastTrain[i].getNameCar());
        }

    }

    String getNameOfTrain() {
        return nameOfTrain;
    }


    @Override
    public int countOfPassengersTrain(RollingStock[] fastTrain) {
        int countOfPassengers = 0;
        for (RollingStock aFastTrain : fastTrain) countOfPassengers += aFastTrain.getAmountOfPassengersCar();
        return countOfPassengers;
    }

    @Override
    public double countOfBaggageTrain(RollingStock[] fastTrain) {
        int countOfBaggage = 0;
        for (RollingStock aFastTrain : fastTrain) countOfBaggage += aFastTrain.getBaggageWeight();
        return countOfBaggage;
    }
}
