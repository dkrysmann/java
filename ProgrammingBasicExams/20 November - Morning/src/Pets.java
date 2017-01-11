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
        double result = Math.abs(foodAvailableKg - totalFood);
        if(foodAvailableKg >= totalFood){
            System.out.printf("%.0f kilos of food left.",Math.floor(result));
        }
        else{
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(result));
        }
    }
}
