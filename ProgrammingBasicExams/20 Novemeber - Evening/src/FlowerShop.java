
import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Magnolia = 3.25;
        double Roses = 3.50;
        double Ziumb = 4;
        double Cactus = 8;
        double magnoliaCount = Double.parseDouble(input.nextLine()) * Magnolia;
        double ziumbCount = Double.parseDouble(input.nextLine()) * Ziumb;
        double rosesCount = Double.parseDouble(input.nextLine()) * Roses;
        double cactusCount = Double.parseDouble(input.nextLine()) * Cactus;

        double giftPrice = Double.parseDouble(input.nextLine());
        double totalPrice = magnoliaCount + ziumbCount + rosesCount + cactusCount;
        double taxes = (totalPrice / 100) * 5;
        double allPrice = totalPrice - taxes;
        if(allPrice < giftPrice){
            double total = Math.ceil(giftPrice - allPrice);
            System.out.printf("She will have to borrow %.0f leva.",total);
        }
        else{
            double total = Math.floor(allPrice - giftPrice);
            System.out.printf("She is left with %.0f leva.",total);
        }

    }
}
