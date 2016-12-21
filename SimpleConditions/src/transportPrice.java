import java.util.Scanner;

public class transportPrice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        String dayOrNight = console.nextLine();
        double taxiStartPrice = 0.70;
        double taxiDay = 0.79;
        double taxiNight = 0.90;
        double bus = 0.09;
        double train = 0.06;
        if(n < 20){
            if(dayOrNight.equals("day")){
                double price = (n * taxiDay) + taxiStartPrice;
                System.out.println(price);
            }
            else{
                double result = (n * taxiNight) + taxiStartPrice;
                System.out.println(result);
            }
        }
        else if(n >= 20 && n < 100){
            double res = n * bus;
            System.out.println(res);
        }
        else{
            double res = n * train;
            System.out.printf("%.2f", res);
        }
    }
}
