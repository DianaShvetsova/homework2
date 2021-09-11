package pro.sky.java.course1.lesson3;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    private static void task2() {
        int friday = 4;
        for (int neededFriday = friday; neededFriday <= 31; neededFriday += 7) {
            System.out.println("Сегодня пятница, " + neededFriday + " " + "-ое число. Необходимо подготовить отчет.");
        }
    }

    private static void task3() {
        int currentYear = 2021;
        int startYear = currentYear - 200;
        int finalYear = currentYear + 79;
        for (int neededYear = startYear; neededYear <= finalYear; neededYear++) {
            if (neededYear % 79 == 0) {
                System.out.println(neededYear);
            }
        }
    }

    private static void task4() {

        for (int a = 1; a <= 30; a++) {
            System.out.print(a + ": ");
            if (a % 3 == 0) {
                System.out.print("ping ");
            }
            if (a % 5 == 0) {
                System.out.print("pong");
            }
            System.out.println();
        }
    }
}

