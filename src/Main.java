import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isLeapYear(2008);
        whichVersionApp(0, 2022);
        System.out.println("Потребуется дней " + calculateDelivery(5));
    }

    public static void isLeapYear(int year) {
        System.out.println("Задача 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void whichVersionApp(int os, int deviceYear) {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        if (os == 0 && deviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 0 && deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 1 && deviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (os == 1 && deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int calculateDelivery(int distance) {
        System.out.println("Задача 3");
        int days = 0;
        if (distance <= 20) {
            days = 1;
        } else if (distance > 20 && distance <= 60) {
            days = 2;
        } else if (distance > 60 && distance <= 100) {
            days = 3;
        }
        return days;
    }
}