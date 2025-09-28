package homeworks;

import java.util.Scanner;

public class SalaryCalculator {

    int workedDays;
    int salary;

    int calculate() {
        int dailyWage = 2000;

        int bonus = (workedDays > 25) ? ((workedDays - 25) * 3000) : (workedDays > 20)
                ? (workedDays - 20) * 1000 : 0;

        salary = workedDays * dailyWage + bonus;
        return salary;
    }

    void showSalary() {
        System.out.println("Personelin maaşı: " + calculate() + " TL");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SalaryCalculator person = new SalaryCalculator();

        System.out.print("Personelin çalıştığı gün sayısını girin: ");
        person.workedDays = scanner.nextInt();

        person.showSalary();

        scanner.close();
    }
}
