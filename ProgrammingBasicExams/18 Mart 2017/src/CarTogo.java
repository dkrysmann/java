import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarTogo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double budget = Double.parseDouble(reader.readLine());
        String season = reader.readLine();
        if (budget <= 100) {
            String carType = "Economy class";
            if (season.equals("Summer")) {
                double cabrio = (budget * 35) / 100;
                System.out.println(carType);
                System.out.printf("Cabrio - %.2f", cabrio);
            } else if (season.equals("Winter")) {
                double jeep = (budget * 65) / 100;
                System.out.println(carType);
                System.out.printf("Jeep - %.2f", jeep);
            }
        } else if (budget > 100 && budget <= 500) {
            String carType = "Compact class";
            if (season.equals("Summer")) {
                double cabrio = (budget * 45) / 100;
                System.out.println(carType);
                System.out.printf("Cabrio - %.2f", cabrio);
            } else if (season.equals("Winter")) {
                double jeep = (budget * 80) / 100;
                System.out.println(carType);
                System.out.printf("Jeep - %.2f", jeep);
            }
        }else{
            String carType = "Luxury class";
            double jeep = (budget * 90) / 100;
            System.out.println(carType);
            System.out.printf("Jeep - %.2f",jeep);
        }
    }
}
