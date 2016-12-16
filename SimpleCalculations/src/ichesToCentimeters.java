import java.util.Scanner;

public class ichesToCentimeters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double oneInch = 2.54;
        System.out.println("inches: ");
        double inches = Double.parseDouble(console.nextLine());
        double inchesToCentimeters = inches * oneInch;
        System.out.println("centimeters =" + inchesToCentimeters);
    }
}
