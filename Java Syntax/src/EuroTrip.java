import java.math.BigDecimal;
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double quantity = input.nextDouble();
        BigDecimal rate = new BigDecimal("4210500000000");
        BigDecimal price = new BigDecimal(1.20 * quantity);
        BigDecimal totalPR = rate.multiply(price);
        System.out.printf("%.2f marks",totalPR);
    }
}
