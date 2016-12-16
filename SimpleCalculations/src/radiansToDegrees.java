import java.util.Scanner;

public class radiansToDegrees {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double radians = Double.parseDouble(console.nextLine());
        double radiansToDegrees = (radians * 180) / Math.PI;
        System.out.println(Math.round(radiansToDegrees));
    }
}
