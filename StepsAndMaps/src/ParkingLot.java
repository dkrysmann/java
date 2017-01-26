import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<String> parking = new HashSet<>();
        while (true) {
            String direction = input.nextLine();
            String[] commandHolder = direction.split(", ");
            if (commandHolder[0].equals("IN")) {
                parking.add(commandHolder[1]);
            } else if(commandHolder[0].equals("OUT")) {
                parking.remove(commandHolder[1]);
            }
            if(direction.equals("END")){
                break;
            }
        }
        if(parking.isEmpty()){
            System.out.printf("Parking Lot is Empty");
        }else{
            for (String cars : parking) {
                System.out.println(cars);
            }
        }
    }
}