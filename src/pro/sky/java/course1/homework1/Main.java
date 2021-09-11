package pro.sky.java.course1.homework1;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        int maxCost = arr[0];
        int minCost = arr[0];
        for (int r = 0; r < arr.length; r++) {
            if (arr[r] > maxCost) {
                maxCost = arr[r];
            }
               if (arr[r] < minCost) {
                minCost = arr[r];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxCost + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minCost + " рублей");

        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double averageSum = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

    }


    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}





