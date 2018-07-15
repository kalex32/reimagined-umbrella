package Transport;

class RollingStock {
    // Транспорт. Определить иерархию подвижного состава железнодорожного транспорта.
    // Создать пассажирский поезд. Подсчитать общую численность пассажиров и багажа.
    // Провести сортировку вагонов поезда на основе уровня комфортности.
    // Найти в поезде вагоны, соответствующие заданному диапазону параметров числа пассажиров.

    private int comfortClass;
    private String name;
    private int carriageCount;

    RollingStock() {
            }

    RollingStock(int carriageCount) {
        this.carriageCount=carriageCount;
    }

    void setComfortClass(int comfortClass) {
        this.comfortClass = comfortClass;
    }

    void setName(String name) {
        this.name = name;
    }

    int getComfortClass() {
        return comfortClass;
    }

    String getName() {
        return name;
    }
}

