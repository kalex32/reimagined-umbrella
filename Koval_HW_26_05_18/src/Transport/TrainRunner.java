package Transport;

import java.util.Arrays;
import java.util.Scanner;

class TrainRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество пассажиров, купивших билеты в СВ: ");
        int passengerCount = scanner.nextInt();
        System.out.println("Введите общий вес багажа пассажиров СВ: ");
        double baggageCount = scanner.nextDouble();

        SleepingCar sleepingCar =new SleepingCar();
        SleepingCar[] sleepingCars=new SleepingCar[sleepingCar.carsCountForPassengers(passengerCount)];
        if (sleepingCars.length>sleepingCar.getAvailableCars()){
            System.out.println("Превышено количество возможных вагонов СВ");
        } else {
            for (int i = 0; i < sleepingCars.length; i++) {
                sleepingCars[i] = new SleepingCar();
            }
        }
        System.out.println(Arrays.toString(sleepingCars));
        System.out.println(sleepingCar.getName());
        System.out.println(sleepingCar.getComfortClass());

        Coupe coupe = new Coupe();

        Train passengerTrain = new Train(sleepingCar, coupe);


        System.out.println(passengerTrain.toString());
        System.out.println(passengerTrain.getCarriages());
      //  System.out.println(sleepingCar.getComfortClass());

    }
}
