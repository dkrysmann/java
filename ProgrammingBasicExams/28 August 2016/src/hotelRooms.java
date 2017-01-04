import java.util.Scanner;

public class hotelRooms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month = input.nextLine();
        int nights = Integer.parseInt(input.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;
        if(month.equals("May") || month.equals("October")){
            studioPrice = 50;
            apartmentPrice = 65;
            if(nights > 14){
                apartmentPrice -= 65 * 0.1;
                studioPrice -= 50 * 0.3;
            }
            else if(nights > 7){
                studioPrice -= 50 * 0.05;
            }
        }
        else if(month.equals("June") || month.equals("September")){
            studioPrice = 75.20;
            apartmentPrice = 68.70;
            if(nights > 14){
                studioPrice -= 75.20 * 0.2;
                apartmentPrice -= 68.70 * 0.2;
            }
        }
        else if(month.equals("July") || month.equals("August")){
            studioPrice = 76;
            apartmentPrice = 77;
            if(nights>14){
                apartmentPrice -= 77 * 0.1;
            }
        }
        double totalApartmentPrice = apartmentPrice * nights;
        double totalStudioPrice = studioPrice * nights;
        System.out.printf("Apartment: %.2f lv.%n",totalApartmentPrice);
        System.out.printf("Studio: %.2f lv.",totalStudioPrice);
    }
}
