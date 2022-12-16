import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isLeapYear(2008);
        whichVersionApp(0, 2022);
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
}