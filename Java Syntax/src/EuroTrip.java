import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double oneKgwurst = 1.20;
       BigDecimal rate = new BigDecimal("4210500000000");
       double inp = input.nextDouble();
       BigDecimal result = BigDecimal.valueOf(inp).multiply(BigDecimal.valueOf(oneKgwurst));
       BigDecimal total = result.multiply(rate);
      //  DecimalFormat formater = new DecimalFormat("##############.00");
      //  System.out.println(formater.format(total)  + " " + "marks");
        System.out.printf("%.2f marks",total);
    }
}
