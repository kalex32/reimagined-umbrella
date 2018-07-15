package Transport2;


import java.util.Scanner;

class RailwayStation {
    // Транспорт. Определить иерархию подвижного состава железнодорожного транспорта.
    // Создать пассажирский поезд. Подсчитать общую численность пассажиров и багажа.
    // Провести сортировку вагонов поезда на основе уровня комфортности.
    // Найти в поезде вагоны, соответствующие заданному диапазону параметров числа пассажиров.

    public static void main(String[] args) {
        FastTrain fastTrain = new FastTrain();
        System.out.println("Комплектация " + fastTrain.getNameOfTrain() + ":");
        for (int i = 0; i < fastTrain.fastTrain.length; i++) {
            System.out.print("Вагон №" + (i + 1) + ", " + fastTrain.fastTrain[i].getComfortClassCar() + " класса" + " - ");
            System.out.println(fastTrain.fastTrain[i].getNameCar());
        }


        System.out.println("Количество пассажиров в " + fastTrain.getNameOfTrain() + ": " + fastTrain.countOfPassengersTrain(fastTrain.fastTrain) + " чел.");
        System.out.println("Количество багажа в " + fastTrain.getNameOfTrain() + ": " + fastTrain.countOfBaggageTrain(fastTrain.fastTrain) + " кг.");

        System.out.println();
        PassengerTrain passengerTrain = new PassengerTrain();
        System.out.println("Комплектация " + passengerTrain.getNameOfTrain() + ":");
        for (int i = 0; i < passengerTrain.passengerTrain.length; i++) {
            System.out.print("Вагон №" + (i + 1) + ", " + passengerTrain.passengerTrain[i].getComfortClassCar() + " класса" + " - ");
            System.out.println(passengerTrain.passengerTrain[i].getNameCar());
        }

        System.out.println("Количество пассажиров в " + passengerTrain.getNameOfTrain() + ": " + passengerTrain.countOfPassengersTrain(passengerTrain.passengerTrain) + " чел.");
        System.out.println("Количество багажа в " + passengerTrain.getNameOfTrain() + ": " + passengerTrain.countOfBaggageTrain(passengerTrain.passengerTrain) + " кг.");

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество пассажиров желающих проехать в одном вагоне (до 90 чел):");
        int countPass = scanner.nextInt();

        for (int i = 0; i < fastTrain.fastTrain.length; i++) {
            if (countPass <= fastTrain.fastTrain[i].getAmountOfPassengersCar()) {
                System.out.println("В скором поезде Вам подходит вагон №" + (i + 1) + " " + fastTrain.fastTrain[i].getNameCar());
            }
        }

        System.out.println();
        for (int i = 0; i < passengerTrain.passengerTrain.length; i++) {
            if (countPass <= passengerTrain.passengerTrain[i].getAmountOfPassengersCar()) {
                System.out.println("В пассажирском поезде Вам подходит вагон №" + (i + 1) + " " + passengerTrain.passengerTrain[i].getNameCar());
            }
        }

        if (countPass > 90) System.out.println("Располагайтесь в нескольких вагонах, требуемого класса");

        System.out.println();
        for (int i = 0; i < fastTrain.fastTrain.length; i++) {
            System.out.print("Вагон №" + (i + 1) + ", " + fastTrain.fastTrain[i].getComfortClassCar() + " класса" + " - ");
            System.out.println(fastTrain.fastTrain[i].getNameCar());
        }

        System.out.println();
        fastTrain.sorting();
        System.out.println();
        passengerTrain.sorting();


    }
}
