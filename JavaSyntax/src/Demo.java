import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {
        float value = 23.23F;
        System.out.println(value);
        BigDecimal num1 = new BigDecimal("1.5");
        BigDecimal num2 = new BigDecimal("2.5");
        BigDecimal res = num1.add(num2);
        System.out.println(res);
    }
}
