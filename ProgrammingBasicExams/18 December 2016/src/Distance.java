import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double oneHour = 60;
        double km = Double.parseDouble(input.nextLine());

        double timeMin = Double.parseDouble(input.nextLine());
        double secondTime = Double.parseDouble(input.nextLine());
        double thirdTime = Double.parseDouble(input.nextLine());

        double fspeed = km * (timeMin / oneHour);
        double afterIncr = (km * 1.1) * (secondTime / oneHour);
        double afterDecr = ((km * 1.1) * 0.95) * (thirdTime / oneHour);
        double total = fspeed + afterIncr + afterDecr;
        System.out.printf("%.2f",total);
    }
}
