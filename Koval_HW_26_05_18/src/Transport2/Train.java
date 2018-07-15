package Transport2;

interface Train {

    int countOfPassengersTrain(RollingStock[] train);

    double countOfBaggageTrain(RollingStock[] train);

    default void sortingByComfortClass(RollingStock[] passengerTrain) {
        for (int i = passengerTrain.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++) {
                if (passengerTrain[j].getComfortClassCar() > passengerTrain[j + 1].getComfortClassCar()) {
                    RollingStock tmp = passengerTrain[j];
                    passengerTrain[j] = passengerTrain[j + 1];
                    passengerTrain[j + 1] = tmp;
                }
            }
    }
}
