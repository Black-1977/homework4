public class Main {
    public static void main(String[] args) {

        // Part 1
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();

        // Part 2
        System.out.println("Задача 2");
        int temp = 15;
        if (temp >= 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temp + " градусов, нужно одеть шапку");
        }
        System.out.println();

        // Part 3
        System.out.println("Задача 3");
        int speed = 85;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + "км/ч, можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + "км/ч, придётся заплатить штраф");
        }
        System.out.println();

        // Part 4
        System.out.println("Задача 4");
        int humanAge = 15;
        if (humanAge > 24) {
            System.out.println("Если человеку " + humanAge + " лет, то ему пора ходить на работу");
        } else {
            if (humanAge >= 18) {
                System.out.println("Если человеку " + humanAge + " лет, то его место в университете");
            } else {
                if (humanAge >= 7) {
                    System.out.println("Если человеку " + humanAge + " лет, то ему нужно ходить в школу");
                } else {
                    if (humanAge >= 2) {
                        System.out.println("Если человеку " + humanAge + " лет, то ему нужно ходить в детский сад");
                    } else {
                        System.out.println("Если человеку " + humanAge + " лет, то ему нужно пока оставаться дома");
                    }
                }
            }
        }
        System.out.println();

        // Part 5
        System.out.println("Задача 5");
        int kidAge = 18;
        if (kidAge >= 14) {
            System.out.println("Если ребёнку " + kidAge + " лет, то ему можно самостоятельно кататься на аттракционах");
        } else {
            if (kidAge >= 5) {
                System.out.println("Если ребёнку " + kidAge + " лет, то он может кататься на аттакционах в сопровождении взрослых");
            } else {
                System.out.println("Если ребёнку " + kidAge + " лет, то ему нельзя кататься на аттракционах");
            }
        }
        System.out.println();

        // Part 6
        System.out.println("Задача 6");
        int passengersCount = 28;
        if (passengersCount < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else {
            if (passengersCount < 102) {
                System.out.println("В вагоне остались только стоячие места");
            } else {
                System.out.println("В вагоне не осталось свободных мест");
            }
        }
        System.out.println();

        // Part 7
        System.out.println("Задача 7");
        int one = 71, two = 37, three = 52;
        System.out.printf("Самое большое число: ");
        if (one >= two) {
            if (one >= three) {
                System.out.println(one);
            } else {
                System.out.println(three);
            }
        } else {
            if (two >= three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }
        System.out.println();

    }
}