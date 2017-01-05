import java.util.Scanner;

public class changeTiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = Double.parseDouble(input.nextLine());
        double floorWidth = Double.parseDouble(input.nextLine());
        double floorLenght = Double.parseDouble(input.nextLine());
        double triangleSize = Double.parseDouble(input.nextLine());
        double triangleHeight = Double.parseDouble(input.nextLine());
        double tilePrice = Double.parseDouble(input.nextLine());
        double priceForMaster = Double.parseDouble(input.nextLine());
        double trash = 5;

        double floorArea = floorWidth * floorLenght;
        double tileArea = triangleSize * triangleHeight / 2;
        double tilesNeeded = (Math.ceil(floorArea / tileArea) + trash);
        double totalPrice = (tilesNeeded * tilePrice) + priceForMaster;
        if(money >= totalPrice){
            double info = money - totalPrice;
            System.out.printf("%.2f lv left.",info);
        }else{
            double info = totalPrice - money;
            System.out.printf("You'll need %.2f lv more.",info);
        }
    }
}
