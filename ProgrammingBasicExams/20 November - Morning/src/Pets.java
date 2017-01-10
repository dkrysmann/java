import java.util.Scanner;

public class Pets {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double days = Double.parseDouble(input.nextLine());
        double foodAvailableKg = Double.parseDouble(input.nextLine());
        double foodForDog = Double.parseDouble(input.nextLine());
        double foodForCat = Double.parseDouble(input.nextLine());
        double foodForTurtle = Double.parseDouble(input.nextLine());
        double dogFoodNeeded = days * foodForDog;
        double catFoodNeeded = days * foodForCat;
        double turleFoodNeeded = days * (foodForTurtle / 1000);
        double totalFood = (dogFoodNeeded + catFoodNeeded + turleFoodNeeded);
        if(foodAvailableKg >= totalFood){
            double res = Math.floor(foodAvailableKg - totalFood);
            System.out.printf("%.0f kilos of food left.",res);
        }
        else{
            double res = Math.ceil(totalFood - foodAvailableKg);
            System.out.printf("%.0f more kilos of food are needed.",res);
        }
    }
}
