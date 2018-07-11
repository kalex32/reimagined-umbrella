import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Car {
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
    Car(int id, String mark, String model, int year, String color, double price, String reg){
        this.id=id;
        this.mark=mark;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
        this.reg=reg;
    }

    public static void main(String[] args) {

        ArrayList<Car>vehicle = new ArrayList<>();

        vehicle.add(new Car(1, "Skoda", "Octavia", 2007, "Silver", 120000, "AA3539CO"));
        vehicle.add(new Car(2, "Renault", "Kangoo", 2012, "White", 146000, "AA9430EA"));
        vehicle.add(new Car(3, "Ford", "Focus", 2013, "White", 138000, "AE4357EK"));
        vehicle.add(new Car(4, "Volkswagen", "Passat", 2004, "Green", 87000, "AE1324HE"));
        vehicle.add(new Car(5, "Ford", "Fiesta", 2006, "Red", 79000, "AM2894HP"));
        vehicle.add(new Car(6, "Mazda", "CX5", 2015, "Dark Grey", 258000, "AC7633BK"));
        vehicle.add(new Car(7, "Toyota", "Land Cruiser Prado 150", 2015, "Black", 450000, "HE0880HE"));
        vehicle.add(new Car(8, "Skoda", "SuperB", 2012, "Silver", 210000, "KB5244MO"));
        vehicle.add(new Car(9, "Audi", "A5", 2010, "Red", 325000, "OA1864CA"));
        vehicle.add(new Car(10, "Mitsubishi", "L200", 2009, "Grey", 199000, "AE0987KE"));
        vehicle.add(new Car(11,"Toyota", "Avensis", 2008, "Red", 125450, "CO2567EA"));
        vehicle.add(new Car(12, "Audi", "A3", 2015, "Sky Blue", 825987, "AE8787EA"));

        System.out.println("Список автомобилей:");
        for (int y=0; y<vehicle.size(); y++){
            System.out.println(vehicle.get(y));
            System.out.print("");
        }
        System.out.println("");

        // Список автомобилей заданной марки
        String m="Skoda";
        System.out.println("Список автомобилей заданной марки "+m+":");
        for (int y=0; y<vehicle.size(); y++){
            if (vehicle.get(y).getMark()==m) {
                System.out.println(vehicle.get(y));
                System.out.print("");
            }
        }
        System.out.println("");

        // список автомобилей заданной модели, которые эксплуатируются больше n лет
        String model1="Passat";
        int n=5;
        System.out.println("список автомобилей модели "+model1+", которые эксплуатируются больше "+n+" лет:");
                Calendar year = new GregorianCalendar();

        for (int y=0; y<vehicle.size(); y++) {
            if (vehicle.get(y).getModel() == model1 && (year.get(GregorianCalendar.YEAR) - vehicle.get(y).getYear()) > n) {
                System.out.println(vehicle.get(y));
                System.out.print("");
            }
        }
        System.out.println("");

        // список автомобилей заданного года выпуска, цена которых больше указанной
            int g=2015;
            double price=12345;
        System.out.println("список автомобилей "+g+" года выпуска, цена которых больше "+price+" грн.:");
        for (int y=0; y<vehicle.size(); y++)
            if (vehicle.get(y).getYear()== g && vehicle.get(y).getPrice()>price) {
                System.out.println(vehicle.get(y));
                System.out.print("");
            }
    }
}