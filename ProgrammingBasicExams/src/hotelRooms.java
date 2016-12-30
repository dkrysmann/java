import java.util.Scanner;

public class hotelRooms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month = input.nextLine();
        double num = Double.parseDouble(input.nextLine());
        if(month.equals("May") || month.equals("October")){
            double apartament = 65;
            double studio = 50;
            if(num > 14){
                double allowanceApartament = (apartament - (apartament * 0.1)) * num;
                double allowanceStudio = (studio - (studio * 0.3)) * num;
                System.out.printf("Apartment: %.2f",allowanceApartament);
                System.out.println();
                System.out.printf("Studio: %.2f",allowanceStudio);
            }
            else if(num > 7){
                double allowanceApartament = (apartament - (apartament * 0.05)) * num;
                double allowanceStudio = (studio - (studio * 0.05)) * num;
                System.out.printf("Apartment: %.2f",allowanceApartament);
                System.out.println();
                System.out.printf("Studio: %.2f",allowanceStudio);
            }
        }
        if(month.equals("June") || month.equals("September")){
            double apartament = 68.70;
            double studio = 75.20;
            if(num >= 14){
                double allowanceApartament = (apartament - (apartament * 0.2)) * num;
                double allowanceStudio = (studio - (studio * 0.2)) * num;
                System.out.printf("Apartment: %.2f",allowanceApartament);
                System.out.println();
                System.out.printf("Studio: %.2f",allowanceStudio);
            }
        }
    }
}
