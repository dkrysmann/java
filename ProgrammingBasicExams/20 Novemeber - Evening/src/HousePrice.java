import java.util.Scanner;


public class HousePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double smallestRoom = Double.parseDouble(input.nextLine());
       double kitchen = Double.parseDouble(input.nextLine());
       double price = Double.parseDouble(input.nextLine());
        double smallest = smallestRoom + ((smallestRoom / 100)*10);
        double third = smallest + ((smallest / 100)*10);
        double bath = smallestRoom / 2;
        double corr = ((smallestRoom + kitchen + smallest + third + bath) / 100) * 5;
        double res = ((smallestRoom + kitchen + smallest + third + bath) + corr) * price;
        System.out.printf("%.2f",res);
    }
}
