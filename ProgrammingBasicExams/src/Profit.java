import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double workDays = Double.parseDouble(input.nextLine());
        double dayliProfit = Double.parseDouble(input.nextLine());
        double usDolarCourse = Double.parseDouble(input.nextLine());
        double bonus = 2.5;
        double monthSalary = workDays * dayliProfit;
        double endYearProfit = monthSalary * 12 + monthSalary * bonus;
        double tax = (endYearProfit / 100) * 25;
        double profitWithoutTax = (endYearProfit - tax) * usDolarCourse;
        double averagePRofitPerDay = profitWithoutTax / 365;
        System.out.printf("%.2f",averagePRofitPerDay);
    }
}
