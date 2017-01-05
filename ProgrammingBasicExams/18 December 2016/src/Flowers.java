

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hrizantemas = Double.parseDouble(input.nextLine());
        double roses = Double.parseDouble(input.nextLine());
        double laleta = Double.parseDouble(input.nextLine());
        String season = input.nextLine();
       String special = input.nextLine();
       double prepared = 2;
       double priceInHolidays = 0.15;
            if(season.equals("Spring") || season.equals("Summer")) {
                double hrizantemasPrice = 2.00;
                double rosesPrice = 4.10;
                double laletaPrice = 2.50;
                double allPrice = (hrizantemas * hrizantemasPrice) + (roses * rosesPrice) + (laleta * laletaPrice);
                if (special.equals("Y")) {
                    allPrice += allPrice * priceInHolidays;
                }
                if (laleta > 7) {
                    allPrice -= allPrice * 0.05;
                }
                if ((hrizantemas + roses + laleta) > 20) {
                    allPrice -= allPrice * 0.2;
                }
                double newPrice = allPrice + prepared;
                System.out.printf("%.2f", newPrice);
            }
          else if(season.equals("Autumn") || season.equals("Winter")) {
                double hrizantemasPriceW = 3.75;
                double rosesPriceW = 4.50;
                double laletaPriceW = 4.15;
                double allPriceW = (hrizantemas * hrizantemasPriceW) + (roses * rosesPriceW) + (laleta * laletaPriceW);
                if (special.equals("Y")) {
                    allPriceW += allPriceW * priceInHolidays;
                }
                if (roses >= 10 && season.equals("Winter")) {
                    allPriceW -= allPriceW * 0.1;
                }
                if ((hrizantemas + roses + laleta) > 20) {
                    allPriceW -= allPriceW * 0.2;
                }
                double newPriceW = allPriceW + prepared;
                System.out.printf("%.2f", newPriceW);
            }
       }
    }
