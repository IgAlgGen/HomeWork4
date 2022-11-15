public class Main {
    public static void main(String[] args) {

        int age = 18;

        int passangers = 65;
        int tottalSeats = 102;
        int seats = 60;

        boolean adultPerson = true;

        // Домашнее задание - 1. Задание 1
        System.out.println("Домашнее задание - 1. Задание 1");
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Совершеннолетие не наступило. Отметь еще " + (18 - age) + " дня рождения.");
        }

        // Домашнее задание - 1. Задане 2
        System.out.println("Домашнее задание - 1. Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенку " + age + " лет, он ходит в школу.");
        }
        if (age >= 18 && age < 27) {
            System.out.println("Подростку " + age + " лет, он закончил школу и может отправляться в университет.");
        }
        if (age >= 24) {
            System.out.println("Человеку " + age + " лет, он окончил университет и ему пора искать первую работу.");
        }
        if (age < 7) {
            System.out.println("Возраст человека не подходит условиям задачи");
        }

        // Домашнее задание - 1. Задание 3
        System.out.println("Домашнее задание - 1. Задание 3");
        if (passangers < tottalSeats) {
            System.out.println("В вагоне есть места.");
        }
        if (passangers < seats) {
            System.out.println("В вагоне есть сидячие и стостоячие места.");
        }
        if (passangers >= seats && passangers < tottalSeats) {
            System.out.println("В вагоне есть только стоячие места.");
        }
        if (passangers >= tottalSeats) {
            System.out.println("Полна коробочка! В вагоне больше нет мест.");
        }

        // Домашнее задание - 2. Задание 1
        System.out.println("Домашнее задание - 2. Задание 1");
        if (age >= 18) {
            System.out.println("Поздравляем вы совершеннолетние, вам больше 18 лет!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил.");
        }

        // Домашнее задание - 2. Задание 2
        System.out.println("Домашнее задание - 2. Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенку " + age + " лет, он ходит в школу.");
        } else if (age >= 18 && age < 27) {
            System.out.println("Подростку " + age + " лет, он закончил школу и может отправляться в университет.");
        } else if (age > 27) {
            System.out.println("Человеку " + age + " лет, он окончил университет и ему пора искать первую работу.");
        } else {
            System.out.println("Возраст человека не подходит условиям задачи");
        }

        // Домашнее задание - 2. Задание 3
        System.out.println("Домашнее задание - 2. Задание 3");
        if (passangers < tottalSeats && passangers < seats) {
            System.out.println("В вагоне есть места. В вагоне есть сидячие и стостоячие места.");
        } else if (passangers >= seats && passangers < tottalSeats) {
            System.out.println("В вагоне есть места. В вагоне есть только стоячие места.");
        } else {
            System.out.println("Полна коробочка! В вагоне больше нет мест.");
        }

        // Домашнее задание - 3. Задание 1
        System.out.println("Домашнее задание - 3. Задание 1");
        if (age >= 2 && age <= 6) {
            System.out.println("Маленькому человеку " + age + " лет, нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Человеку " + age + " лет, нужно ходить в школу.");
        } else if (age > 18 && age < 24) {
            System.out.println("Человеку " + age + " лет, он учится в университете.");
        } else {
            System.out.println("Человеку" + age + " лет. Пора на работу.");
        }

        // Домашнее задание - 3. Задание 2
        System.out.println("Домашнее задание - 3. Задание 2");
        if (age < 5) {
            System.out.println("Ребенок НЕ МОЖЕТ кататься на аттракционе.");
        } else if (adultPerson == true && age >= 5 && age < 14) {
            System.out.println("Ребенок МОЖЕТ кататься на аттракционе В СОПРОВОЖДЕНИИ взрослого.");
        } else if (adultPerson != true && age >= 5 && age < 14) {
            System.out.println("Ребенок НЕ МОЖЕТ кататься на аттракционе БЕЗ СОПРОВОЖДЕНИЯ взрослого.");
        } else {
            System.out.println("Ребенок может кататься на аттракционе");
        }

        // Домашнее задание - 3. Задание 3
        System.out.println("Домашнее задание - 3. Задание 3");
        int one;
        int two;
        int free;
        one = 300;
        two = 70;
        free = 125;
        if (one > two && one > free) {
            System.out.println("Число " + one + " больше остальных.");
        } else if (two > one && two > free) {
            System.out.println("Число " + two + " больше остальных.");
        } else if (free > one && free > two) {
            System.out.println("Число " + free + " больше остальных.");
        }
    }
}