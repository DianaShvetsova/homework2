package pro.sky.java.course1.homework6;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task7();
    }

    private static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника – " + fullName);

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
        String first = "135";
        String second = "246";
        StringBuilder g = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            g.append(first.charAt(i)).append(second.charAt(i));
        }
        System.out.println(g.toString());
    }
}
