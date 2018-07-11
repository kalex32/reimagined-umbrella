package Transport2;

import java.util.Arrays;
import java.util.Comparator;

class FastTrain implements Train, Comparator {

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


    @Override
    int compare(Object o1, Object o2) {
        if (o1[0].getComfortClassCar()<fastTrain2[1].getComfortClassCar())
        return -1;
    }

    String getNameOfTrain() {
        return nameOfTrain;
    }


    @Override
    public int countOfPassengersTrain(RollingStock[] fastTrain) {
        int countOfPassengers = 0;
        for (int i = 0; i < fastTrain.length; i++) countOfPassengers += fastTrain[i].getAmountOfPassengersCar();
        return countOfPassengers;
    }

    @Override
    public double countOfBaggageTrain(RollingStock[] fastTrain) {
        int countOfBaggage = 0;
        for (int i = 0; i < fastTrain.length; i++) countOfBaggage += fastTrain[i].getBaggageWeight();
        return countOfBaggage;
    }
}
