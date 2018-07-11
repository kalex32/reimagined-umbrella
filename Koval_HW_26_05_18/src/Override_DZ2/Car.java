package Override_DZ2;

import java.util.*;

public class Car {
    //Создать класс Car со следующими полями:
    //  id,
    // Марка,
    // Модель,
    // Год выпуска,
    //  Цвет,
    // Цена,
    //  Регистрационный номер.
    //Определить конструкторы и методы setТип(), getТип(), toString(). Создать массив объектов. Вывести:
    //a) список автомобилей заданной марки;
    //b) список автомобилей заданной модели, которые эксплуатируются больше n лет;
    //c) список автомобилей заданного года выпуска, цена которых больше указанной.

    private int id; // Порядковый номер
    private String mark; //  Марка автомобиля
    private String model; // Модель
    private int year; // Год выпуска
    private String color; // Цвет
    private double price; // Текущая стоимость
    private String reg; // Гос. номер


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", reg='" + reg + '\'' +
                '}';
    }

    Car(int id, String mark, String model, int year, String color, double price, String reg) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.reg = reg;
    }

    // Список автомобилей заданной марки
    public static void searchMark(Car[] vehicle, String mark) {
        System.out.println("Список автомобилей заданной марки " + mark + ":");
        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i].getMark().equalsIgnoreCase(mark)) {
                System.out.println(vehicle[i]);
            }
        }
    }

    // список автомобилей заданной модели, которые эксплуатируются больше n лет
    public static void searchModelYear(Car[] vehicle, int yearOfExp, String model) {

        System.out.println("список автомобилей модели " + model + ", которые эксплуатируются больше "
                + yearOfExp + " лет:");
        Calendar year = new GregorianCalendar();
        for (int i = 0; i < vehicle.length; i++) {
            if (model.equalsIgnoreCase(vehicle[i].getModel()) && (year.get(GregorianCalendar.YEAR) -
                    vehicle[i].getYear()) > yearOfExp) {
                System.out.println(vehicle[i]);
            }
        }
    }

    // список автомобилей заданного года выпуска, цена которых больше указанной
    public static void searchYearPrice(Car[] vehicle, int yearOfProd, double price) {
        System.out.println("список автомобилей " + yearOfProd + " года выпуска, цена которых больше " + price + " грн.:");
        for (int i = 0; i < vehicle.length; i++)
            if (vehicle[i].getYear() == yearOfProd && vehicle[i].getPrice() > price) {
                System.out.println(vehicle[i]);
            }
    }
}

class CarRun {

    public static void main(String[] args) {
        Car[] vehicle = new Car[12];

        vehicle[0] = new Car(1, "Skoda", "Octavia", 2007, "Silver", 120000, "AA3539CO");
        vehicle[1] = new Car(2, "Renault", "Kangoo", 2012, "White", 146000, "AA9430EA");
        vehicle[2] = new Car(3, "Ford", "Focus", 2013, "White", 138000, "AE4357EK");
        vehicle[3] = new Car(4, "Volkswagen", "Passat", 2004, "Green", 87000, "AE1324HE");
        vehicle[4] = new Car(5, "Ford", "Fiesta", 2006, "Red", 79000, "AM2894HP");
        vehicle[5] = new Car(6, "Mazda", "CX5", 2015, "Dark Grey", 258000, "AC7633BK");
        vehicle[6] = new Car(7, "Toyota", "Land Cruiser Prado 150", 2015, "Black", 450000, "HE0880HE");
        vehicle[7] = new Car(8, "Skoda", "SuperB", 2012, "Silver", 210000, "KB5244MO");
        vehicle[8] = new Car(9, "Audi", "A5", 2010, "Red", 325000, "OA1864CA");
        vehicle[9] = new Car(10, "Mitsubishi", "L200", 2009, "Grey", 199000, "AE0987KE");
        vehicle[10] = new Car(11, "Toyota", "Avensis", 2008, "Red", 125450, "CO2567EA");
        vehicle[11] = new Car(12, "Audi", "A3", 2015, "Sky Blue", 825987, "AE8787EA");

        System.out.println("Список автомобилей:");
        for (Car auto : vehicle) {
            System.out.println(auto);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите точное наименование искомой марки:");
        String mark = scanner.nextLine();
        Car.searchMark(vehicle, mark);

        System.out.println("Введите искомую модель авто:");
        String mod = scanner.nextLine();
        System.out.println("Введите срок, больше которого модель эксплуатируется:");
        int y = scanner.nextInt();
        Car.searchModelYear(vehicle, y, mod);

        System.out.println("Введите искомый год выпуска авто:");
        int year = scanner.nextInt();
        System.out.println("Введите миннимальную стоимость:");
        double price = scanner.nextDouble();
        Car.searchYearPrice(vehicle, year, price);
    }
}