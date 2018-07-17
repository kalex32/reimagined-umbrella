package Transport2;

interface Train {

    int countOfPassengersTrain(RollingStock[] train);

    double countOfBaggageTrain(RollingStock[] train);

    default void sortingByComfortClass(RollingStock[] train) {
        for (int i = train.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++) {
                if (train[j].getComfortClassCar() > train[j + 1].getComfortClassCar()) {
                    RollingStock tmp = train[j];
                    train[j] = train[j + 1];
                    train[j + 1] = tmp;
                }
            }
    }
}
