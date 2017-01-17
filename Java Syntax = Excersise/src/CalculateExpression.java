import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double nun3 = input.nextDouble();
        double extend = (num1+num2+nun3) / Math.sqrt(nun3);
        double firstFormula = ((num1*num1 + num2*num2) / (num1*num1 - num2*num2));
        System.out.println(firstFormula);

    }
}
