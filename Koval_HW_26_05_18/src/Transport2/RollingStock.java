package Transport2;

class RollingStock {
    // Транспорт. Определить иерархию подвижного состава железнодорожного транспорта.
    // Создать пассажирский поезд. Подсчитать общую численность пассажиров и багажа.
    // Провести сортировку вагонов поезда на основе уровня комфортности.
    // Найти в поезде вагоны, соответствующие заданному диапазону параметров числа пассажиров.

    private int comfortClassCar;
    private String nameCar;
    private int amountOfPassengersCar;
    private double baggageWeight;

    public RollingStock() {
    }


//    public RollingStock(int comfortClassCar, String nameCar, int amountOfPassengersCar, double baggageWeight) {
//        this.comfortClassCar = comfortClassCar;
//        this.nameCar = nameCar;
//        this.amountOfPassengersCar = amountOfPassengersCar;
//        this.baggageWeight = baggageWeight;
//    }

    int getComfortClassCar() {
        return comfortClassCar;
    }

    void setComfortClassCar(int comfortClassCar) {
        this.comfortClassCar = comfortClassCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    int getAmountOfPassengersCar() {
        return amountOfPassengersCar;
    }

    void setAmountOfPassengersCar(int amountOfPassengersCar) {
        this.amountOfPassengersCar = amountOfPassengersCar;
    }

    double getBaggageWeight() {
        return baggageWeight;
    }

    void setBaggageWeight(double baggageWeight) {
        this.baggageWeight = baggageWeight;
    }
}
