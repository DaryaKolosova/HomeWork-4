public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 23;
        if (age <= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        }

        System.out.println("Задание 2");

        int temperature = -4;
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        System.out.println("Задание 3");

        int speed = 100;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , можно ездить спокойно");
        }

        System.out.println("Задание 4");

        int ageHuman = 30;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад");
        }
        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в университет");
        }
        if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу");
        }

        System.out.println("Задание 5");

        int ageChild = 17;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он не может кататься на аттракционе");
        } else {
            if (ageChild >= 5 && ageChild <= 14) {
                System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
            } else {
                System.out.println("Если возраст ребенка равен " + ageChild + ", то может кататься без сопровождения взрослого");
            }
        }
        System.out.println("Задание 6");

        int allPassangers = 102;
        int ticketsSold = 102;
        int passangersSitting = 60;
        int ticketsSoldSitting = 55;
        int passngersStanding = allPassangers - passangersSitting;
        int ticketsSoldStanding = 41;
        boolean seatOnTheTrain = ticketsSold < 102;
        boolean seatingOnTheTrain = ticketsSoldSitting >= 60;
        boolean standingOnTheTrain = ticketsSoldStanding >= passngersStanding;
        if (ticketsSold >= 102) {
            System.out.println("Вагон уже полностью забит");
        } else {
            if (seatOnTheTrain) {
                System.out.println("Места в вагоне есть");
            }
            if (seatingOnTheTrain) {
                System.out.println("В вагоне нет сидячих мест");
            } else {
                System.out.println("В вагоне есть сидячие места");
            }
            if (standingOnTheTrain) {
                System.out.println("В вагоне нет стоячих мест");
            } else {
                System.out.println("В вагоне есть стоячие места");
            }
        }

        System.out.println("Задание 7");

        int one = 7;
        int two = 6;
        int three = 5;
        if (one > two && one > three) {
            System.out.println("Самое большое число - " + one);
        } else {
            if (two > one && two > three) {
                System.out.println("Самое большое число - " + two);
            } else {
                System.out.println("Самое большое число -" + three);
            }
        }
    }
}