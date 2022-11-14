public class Main {
    public static void main(String[] args) {
        // Домашнее задание - 1. Задание 1
        System.out.println("Домашнее задание - 1. Задание 1");
        int age = 16;
        if (age >= 18)  {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age <18)    {
            System.out.println("Совершеннолетие не наступило. Отметь еще " +(18 - age)+ " дня рождения.");
        }

        // Домашнее задание - 1. Задане 2
        System.out.println("Домашнее задание - 1. Задание 2");
        int personAge = 27;
        if (personAge >= 7) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (personAge >= 18)    {
            System.out.println("Подросток закончил школу и может отправляться в университет.");
        }
        if (personAge >= 24)    {
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }

        // Домашнее задание - 1. Задание 3
        System.out.println("Домашнее задание - 1. Задание 3");
        int passangers = 60;
        int tottalSeats = 102;
        int seats = 60;
        if (passangers < tottalSeats)    {
            System.out.println("В вагоне есть места.");
        }
        if (passangers < seats)   {
            System.out.println("В вагоне есть сидячие и стостоячие места.");
        }
        if (passangers >= seats && passangers < tottalSeats) {
            System.out.println("В вагоне есть только стоячие места.");
        }
        if (passangers >= tottalSeats)   {
            System.out.println("Полна коробочка! В вагоне больше нет мест.");
        }

        // Домашнее задание - 2. Задание 1
        System.out.println("Домашнее задание - 2. Задание 1");


    }
}