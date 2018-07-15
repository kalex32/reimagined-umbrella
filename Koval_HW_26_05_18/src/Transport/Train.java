package Transport;

class Train<T> {
    private T[] carriages;


    Train(T... carriage) {
        this.carriages = carriage;
    }

    public T getCarriages() {
        return (T) carriages;
    }

    public void setCarriages(T carriages) {
        this.carriages = (T[]) carriages;
    }

//    SleepingCar sleepingCar = new SleepingCar();
//    Coupe coupe = new Coupe();
}
