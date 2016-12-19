import java.util.Scanner;

public class ExcellentOrNot {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double input = Double.parseDouble(console.nextLine());
        if(input >= 5.50){
            System.out.println("Excellent!");
        }
        else{
            System.out.println("Not excellent.");
        }
    }
}
