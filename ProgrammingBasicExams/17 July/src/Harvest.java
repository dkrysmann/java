import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double X = Double.parseDouble(input.nextLine());
        double Y = Double.parseDouble(input.nextLine());
        double wineLitersNeeded = Double.parseDouble(input.nextLine());
        double workers = Double.parseDouble(input.nextLine());

        double totalGrapes = X * Y;
        double wineProduced = (totalGrapes * 0.40) / 2.5;
        double wineForWorkers = (wineProduced-wineLitersNeeded) / workers;
        double wineRemaining = wineProduced - wineLitersNeeded;
        if(wineProduced >= wineLitersNeeded){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n%.0f liters left -> %.0f liters per person.",wineProduced,
                    Math.floor(wineRemaining),Math.ceil(wineForWorkers));


        }else if(wineProduced < wineLitersNeeded){
            double neededWine = wineLitersNeeded - wineProduced;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(neededWine));
        }

    }
}
