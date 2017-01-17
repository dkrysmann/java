import java.math.BigDecimal;
import java.util.Scanner;

public class ProductOfNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       double a = input.nextDouble();
       double b = input.nextDouble();
        BigDecimal product = new BigDecimal(1);
        double index = a;
        do {
           product = product.multiply((BigDecimal.valueOf(index)));
           index++;
        }while (index <= b);
        System.out.printf("product[%.0f..%.0f] = %.0f",a,b,product);
    }
}
