package OverloadConstruct;

class Date {
    // Создайте класс Date, у которого будут приватные поля - месяц, день и год.
    // В вашем классе должен быть конструктор, который инициализирует три переменные экземпляра и предполагает,
    // что предоставленные значения верны.
    //Создайте геттеры и сеттеры для каждой переменной класса.
    //  Создайте метод displayDate, который отображает месяц, день и год, разделенные косой чертой (/).
    //Напишите тестовое приложение с именем DateTest, которое демонстрирует возможности ClassDate.
    //(Пользователь вводит день месяц и год)
    private int month;
    private int day;
    private int year;

    int getMonth() {
        return month;
    }

    void setMonth(int month) {
        this.month = month;
    }

    int getDay() {
        return day;
    }

    void setDay(int day) {
        this.day = day;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    Date() {
        this.month = 0;
        this.day = 0;
        this.year = 0;
    }

    void displayDate(Date date) {
        System.out.println("Дата: " + date.day + "/" + date.month + "/" + date.year);
    }
}