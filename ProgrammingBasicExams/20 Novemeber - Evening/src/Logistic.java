import java.util.Scanner;

public class Logistic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bus = 0;
        double truck = 0;
        double train = 0;
        double allTons = 0;

        double loadNumber = Double.parseDouble(input.nextLine());
        for (int i = 0; i < loadNumber; i++) {
            double inputTons = Double.parseDouble(input.nextLine());
            if(inputTons <= 3){
                bus+=inputTons;
            }
            else if(inputTons >= 4 && inputTons <= 11){
                truck+=inputTons;
            }
            else{
                train+=inputTons;
            }
            allTons += inputTons;
        }
            double busPrice = bus*200;
            double truckPrice = truck * 175;
            double trainPrice = train * 120;
            double average = (busPrice + truckPrice + trainPrice) / allTons;
            double busPercent = (bus / allTons) * 100;
            double truckPercent = (truck / allTons) * 100;
            double trainPercent = (train / allTons) * 100;
        System.out.printf("%.2f%n",average);
        System.out.printf("%.2f%%%n",busPercent);
        System.out.printf("%.2f%%%n",truckPercent);
        System.out.printf("%.2f%%%n",trainPercent);
    }
}
