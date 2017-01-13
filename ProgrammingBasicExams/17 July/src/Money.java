import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double oneBitcoinLV = 1168;
        double oneChinese = 0.15;
        double oneDolar = 1.76;
        double oneEuro = 1.95;
        double bitcoins = Double.parseDouble(input.nextLine());
        double chinese = Double.parseDouble(input.nextLine());
        double commission = Double.parseDouble(input.nextLine());
        double chineseToDolar = oneChinese * chinese;
        double dollarsToLv = chineseToDolar * oneDolar;
        double res = ((bitcoins * oneBitcoinLV) + dollarsToLv) / oneEuro;
        double commissionResult = (res / 100) * commission;
        double total = res - commissionResult;
        BigDecimal formater = new BigDecimal(total);
        if(formater.scale() > 10 && formater.scale() <12){
            System.out.println(formater.setScale(12,BigDecimal.ROUND_HALF_UP));
        }
            else if(formater.scale() <= 4){
            System.out.println(formater.setScale(10,BigDecimal.ROUND_HALF_UP));
        }

    }
}
