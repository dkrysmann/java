import java.util.Scanner;

public class invalidNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double input = Double.parseDouble(console.nextLine());
        boolean zero = (input == 0);
        boolean isValid = (input >= 100 && input <= 200) || zero;
        if(!isValid){
            System.out.println("invalid");
        }
    }
}
