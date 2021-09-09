package pro.sky.java.course1.homework6;

public class Main {
    private static Object Array;

    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника – " + fullName);

        task2();
        task3();
        task4();
        task7();
    }

    private static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        String forReport = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета – " + forReport);
    }

    private static void task3() {
        String fullName = "Ivanov Ivan Ivanovich";
        String forPass = fullName.replace(" ", ";");
        System.out.println("Данные ФИО сотрудника для административного отдела – " + forPass);
    }

    private static void task4() {
        String fullName = "Иванов Семён Семёнович";
        String rightName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника – " + rightName);
    }
    private static void task7() {
    StringBuilder first = new StringBuilder("135");
    StringBuilder second = new StringBuilder("246");
            first.setCharAt(1, '2');
            first.setCharAt(2, '3');
        second.setCharAt(0, '4');
        second.setCharAt(1, '5');
            System.out.print(first);
        System.out.print(second);
    }
}
