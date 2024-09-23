public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №5 \n");

        //Task 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Задание №1: \nУстановите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Задание №1: \nУстановите версию приложения для Android по ссылке");
        } else {
            System.out.println("Задание №1: \nНе удалось определить Вашу операционную систему");
        }


        //Task 2
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("\nЗадание №2: \nУстановите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("\nЗадание №2: \nУстановите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("\nЗадание №2: \nУстановите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("\nЗадание №2: \nУстановите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("\nЗадание №2: \nНе удалось определить Вашу операционную систему");
        }


        //Task 3
        int year = 2021;
        if (year % 4 == 0) {
            System.out.println("\nЗадание №3: \n" + year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println("\nЗадание №3: \n" + year + " год не является високосным");
        } else if (year % 400 == 0) {
            System.out.println("\nЗадание №3: \n" + year + " год является високосным");
        } else {
            System.out.println("\nЗадание №3: \n" + year + " год не является високосным");
        }


        //Task 4
        int deliveryDistance = 95;
        boolean distanceOne = deliveryDistance <= 20;
        boolean distanceTwo = deliveryDistance >= 20 && deliveryDistance <= 60;
        boolean distanceThree = deliveryDistance >= 60 && deliveryDistance <= 100;
        int deliveryTime = 0;
        if (distanceOne) {
            deliveryTime = deliveryTime + 1;
            System.out.println("\nЗадание №4: \nПотребуется дней " + deliveryTime);
        } else if (distanceTwo) {
                deliveryTime = deliveryTime + 2;
                System.out.println("\nЗадание №4: \nПотребуется дней " + deliveryTime);
        } else if (distanceThree) {
                deliveryTime = deliveryTime + 3;
                System.out.println("\nЗадание №4: \nПотребуется дней " + deliveryTime);
        } else {
            System.out.println("\nЗадание №4: \nСвыше 100 км доставки нет");
        }


        //Task 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("\nЗадание №5: \nЭтот месяц принадлежит к сезону Зима");
                break;
            case 2:
                System.out.println("\nЗадание №5: \nЭтот месяц принадлежит к сезону Зима");
                break;
            case 3:
                System.out.println("\nЗадание №5: \nЭтот месяц принадлежит к сезону Весна");
                break;
            case 4:
                System.out.println("\nЗадание №5: \nЭтот месяц принадлежит к сезону Весна");
                break;
            case 5:
                System.out.println("\nЗадание №5: \nЭтот месяц принадлежит к сезону Весна");
                break;
            case 6:
                System.out.println("\nЗадание №5: \nЭтот месяц принадлежит к сезону Лето");
                break;
            case 7:
                System.out.println("\nЗадание №5: \nЭтот месяц принадлежит к сезону Лето");
                break;
            case 8:
                System.out.println("\nЗадание №5: \nЭтот месяц принадлежит к сезону Лето");
                break;
            case 9:
                System.out.println("\nЗадание №5: \nЭтот месяц принадлежит к сезону Осень");
                break;
            case 10:
                System.out.println("\nЗадание №5: \nЭтот месяц принадлежит к сезону Осень");
                break;
            case 11:
                System.out.println("\nЗадание №5: \nЭтот месяц принадлежит к сезону Осень");
                break;
            case 12:
                System.out.println("\nЗадание №5: \nЭтот месяц принадлежит к сезону Зима");
                break;
            default:
                System.out.println("\nЗадание №5: \nТакого месяца не существует");
        }
    }
}