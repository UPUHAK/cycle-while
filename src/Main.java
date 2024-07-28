public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("task 1");

        int totalMoney = 0;
        int monthMoney = 15_000;
        int month = 0;
        int requiredAmount = 2_459_000;

        while (totalMoney < requiredAmount) {
            totalMoney += monthMoney;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalMoney + " рублей.");
        }

        // task 2
        System.out.println("task 2");

        int number = 1;

        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }

        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        // task 3
        System.out.println("task 3");

        int population = 12_000_000;
        int birthRate = 17; // на 1000 чел.
        int mortalityRate = 8; // на 1000 чел.

        for (int i = 1; i <= 10; i++) {
            population = population + (population / 1000 * birthRate) - (population / 1000 * mortalityRate);
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        // task 4
        System.out.println("task 4");

        int deposit = 15000;
        requiredAmount = 12_000_000;
        int depositRate = 7; // %
        month = 0;
        while (deposit < requiredAmount) {
            month++;
            deposit = deposit + (deposit / 100 * depositRate);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей.");
        }

        // task 5
        System.out.println("task 5");

        deposit = 15000;
        month = 0;

        while (deposit < requiredAmount) {
            month++;
            deposit = deposit + (deposit / 100 * depositRate);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей.");
            }
        }

        // task 6
        System.out.println("task 6");

        deposit = 15000;
        for (int i = 1; i <= 12 * 9; i++) {
            deposit = deposit + (deposit / 100 * depositRate);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей.");
            }
        }

        // task 7
        System.out.println("task 7");

        int firstFriday = 4;
        for (int i = firstFriday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }

        // task 8
        System.out.println("task 8");

        int currentYear = 2024;
        int startPeriod = currentYear - 200;
        int finishPeriod = currentYear + 100;

        for (int i = startPeriod; i <= finishPeriod; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

    }
}