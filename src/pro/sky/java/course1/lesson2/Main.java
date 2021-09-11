package pro.sky.java.course1.lesson2;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
    }

    private static void Task1() {
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    private static void Task2() {
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear <= 2019) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке");
            } else System.out.println("Установите обычную приложения для iOS по ссылке");
        } else {
            if (clientDeviceYear <= 2019) {
                System.out.println("Установите lite-версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную приложения для Android по ссылке");
            }
        }
    }

    private static void Task3() {
        int year = 2020;
        if (year % 4 != 0 && year % 100 == 0 && year % 400 != 0) {
            System.out.println("Год не является високосным");
        } else {
            System.out.println("Год является високосным");
        }
    }

    private static void Task4() {
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDay += 1;
        } else if (deliveryDistance > 60) {
            deliveryDay += 2;
        }
        System.out.println("Доставка занимает " + deliveryDay + " дня");
    }

    private static void Task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

    private static void Task6() {
        int age = 19;
        int salary = 58000;
        double limit = salary;
        if (age < 23) {
            limit *= 2;
        }
        if (age >= 23) {
            limit *= 3;
        }
        if (salary > 50000 && salary < 80000) {
            limit *= 1.2;
        }
        if (salary >= 80000) {
            limit *= 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
    }


}
