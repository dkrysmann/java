import com.sun.deploy.resources.Deployment_pt_BR;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hrizantemas = Double.parseDouble(input.nextLine());
        double roses = Double.parseDouble(input.nextLine());
        double laleta = Double.parseDouble(input.nextLine());
        String season = input.nextLine();
       String special = input.nextLine();
       double hrizantemaSpringSummer = 0;
       double hrizantemaAutumnWinter = 0;
       double roseSpringSummer = 0;
       double rosesAutumnWinter = 0;
       double laleSpringSummer = 0;
       double laleAutumnWinter = 0;
       double prepared = 2;
       switch (season){
           case "Spring":
               hrizantemaSpringSummer = 2;
               roseSpringSummer = 4.10;
               laleSpringSummer = 2.50;
               double price = (hrizantemas*hrizantemaSpringSummer) + (roses * roseSpringSummer) + (laleta
               * laleSpringSummer);
               if(special.equals("Y")){
                   double specialDay = ((price / 100) * 15);
                   double newPrice = price + specialDay;
                   if(laleta >= 7){
                       double allowance = ((newPrice / 100) * 5);
                       double secondPrice = (newPrice - allowance) + prepared;
                       System.out.printf("%.2f",secondPrice);
                   }
               }else if((hrizantemas + roses + laleta) <= 20){
                   System.out.printf("%.2f",price + prepared);
               }
               break;
           case "Summer":
               hrizantemaSpringSummer = 2;
               roseSpringSummer = 4.10;
               laleSpringSummer = 2.50;
               double priceS = (hrizantemas*hrizantemaSpringSummer) + (roses * roseSpringSummer) + (laleta
                       * laleSpringSummer);
               if(special.equals("Y")){
                   double specialDay = ((priceS / 100) * 15);
                   double newPrice = priceS + specialDay;
                   System.out.printf("%.2f",newPrice);
               }else{
                   System.out.printf("%.2f",priceS + prepared);
               }
       }
    }
}
