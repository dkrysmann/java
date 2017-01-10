import java.util.Scanner;

public class Bike {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double juniors = Double.parseDouble(input.nextLine());
        double seniors = Double.parseDouble(input.nextLine());
        String trace = input.nextLine();
        double sum1 = 0;
        if (trace.equals("trail")) {
            double juniorTaxe = 5.50;
            double seniorTaxe = 7;
            double sum = (juniors * juniorTaxe) + (seniors * seniorTaxe);
            double taxe = (sum / 100) * 5;
             sum1 = sum - taxe;
       //     System.out.printf("%.2f", total);
        } else if (trace.equals("cross-country")) {
            double players = juniors + seniors;
            if (players >= 50) {
                double juniorTaxe = 8;
                double seniorTaxe = 9.5;
                double taxe = ((juniors * juniorTaxe) + (seniors * seniorTaxe)) / 100 * 5;
                double sum = ((juniors * juniorTaxe) + (seniors * seniorTaxe)) - taxe;
                sum = ((sum / 100) * 25) + taxe;
                 sum1 = (juniors * juniorTaxe) + (seniors * seniorTaxe) - sum;
           //     System.out.printf("%.2f",total);
            }
            else{
                double juniorTaxe = 8;
                double seniorTaxe = 9.5;
                double taxe = ((juniors * juniorTaxe) + (seniors * seniorTaxe)) / 100 * 5;
                 sum1 = ((juniors * juniorTaxe) + (seniors * seniorTaxe)) - taxe;
           //     System.out.printf("%.2f",sum1);
            }
        }
        else if(trace.equals("downhill")){
            double juniorTaxe = 12.25;
            double seniorTaxe = 13.75;
            double taxe = ((juniors * juniorTaxe) + (seniors * seniorTaxe)) / 100 * 5;
             sum1 = ((juniors * juniorTaxe) + (seniors * seniorTaxe)) - taxe;
        //    System.out.printf("%.2f",sum1);
        }
        else {
            double juniorTaxe = 20;
            double seniorTaxe = 21.5;
            double taxe = ((juniors * juniorTaxe) + (seniors * seniorTaxe)) / 100 * 5;
             sum1 = ((juniors * juniorTaxe) + (seniors * seniorTaxe)) - taxe;
        //    System.out.printf("%.2f",sum1);
        }
        System.out.printf("%.2f",sum1);
    }
}