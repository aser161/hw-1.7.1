public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        int investment = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000){
            total += investment;
            month++;
        }
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");

        // Задание 2
        System.out.println("Задание 2");
        int i = 1;
        int start = 10;
        while (i<=10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (start=10; start >=1;start--){
            System.out.print(start + " ");
        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        int populationY = 12_000_000;
        int bornY = 17;
        int dieY = 8;
        int totalNaturalIncrease = 0;

        for (int year = 1; year <=10;year++) {
            populationY += totalNaturalIncrease;
            totalNaturalIncrease = (populationY / 1000) * (bornY - dieY);
            System.out.println("Год " + year + ", численность населения составляет " + populationY);
        }

        // Задание 2.1
        System.out.println("Задание 2.1");
        int deposit = 15000;
        int percent = 0;
        int month1 = 0;
        while (deposit <= 12_000_000) {
            deposit = deposit + percent;
            percent = deposit / 100 * 7;
            month1++;
            if (month1 % 6 == 0) {
                System.out.println(month1 + " " + deposit);
            }
        }

            // Задание 2.3
            System.out.println("Задание 2.3");
            int deposit1 = 15000;
            int percent1 = 0;
            int month2 = 0;
            while (month2 <= 108) {
                deposit1 = deposit1 + percent1;
                percent1 = deposit1 / 100 * 7;
                month2++;
                if (month2 % 6 == 0) {
                    System.out.println(month2 + " " + deposit1);
                }
            }

        // Задание 2.4
        System.out.println("Задание 2.4");
        int friday = 5;
        for (; friday <= 31; friday += 7){
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет.");
        }

        // Задание 3.1
        System.out.println("Задание 3.1");
        int year1 = 0;
        int yearNow = 2022;
        int year200ago = yearNow - 200;
        int year100later = yearNow + 100;
        for (; year1 <= year100later; year1 += 79){
            if (year1 > year200ago && year1 < year100later) {
                System.out.println(year1);
            }
        }

          // Задание 3.2
        System.out.println("Задание 3.2");
        int x = 0;
        for (int i1 = 1; i1 <= 10; i1++){
        x = 2*i1;
            System.out.println("2 * " + i1 + " = " + x);
        }
    }
}