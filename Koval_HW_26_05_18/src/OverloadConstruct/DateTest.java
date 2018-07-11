package OverloadConstruct;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательно дату:");
        System.out.println("День:");
        date.setDay(scanner.nextInt());
        System.out.println("Месяц:");
        date.setMonth(scanner.nextInt());
        System.out.println("Год:");
        date.setYear(scanner.nextInt());
        if (date.getYear() < 0) {
            System.out.println("Неправильно указана дата1");
        } else if (date.getMonth() < 1 | date.getMonth() > 12) {
            System.out.println("Неправильно указана дата2");
        } else if (date.getMonth() == 1 | date.getMonth() == 3 | date.getMonth() == 5 | date.getMonth() == 7 |
                date.getMonth() == 8 | date.getMonth() == 10 | date.getMonth() == 12 &&
                (date.getDay() < 1 | date.getDay() > 31)) {
            System.out.println("Неправильно указана дата3");
        } else if (date.getMonth() == 4 | date.getMonth() == 6 | date.getMonth() == 9 | date.getMonth() == 11 &&
                (date.getDay() < 1 | date.getDay() > 30)) {
            System.out.println("Неправильно указана дата4");
        } else if (date.getYear() % 4 == 0 & date.getMonth() == 2 && (date.getDay() < 1 | date.getDay() > 29)) {
            System.out.println("Неправильно указана дата5");
        } else if (date.getYear() % 4 != 0 & date.getMonth() == 2 && (date.getDay() < 1 | date.getDay() > 28)) {
            System.out.println("Неправильно указана дата6");
        } else date.displayDate(date);
    }
}
