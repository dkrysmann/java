import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<String> parking = new HashSet<>();
        while (true){
            String direction = input.nextLine();
            if(direction.equals("END")){
                break;
            }
            String[] command = direction.split(", ");
            if(command[0].equals("IN")){
                parking.add(command[1]);
            }else{
                parking.remove(command[1]);
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
