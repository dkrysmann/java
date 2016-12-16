import java.util.Scanner;

public class convertorFromCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double celsius = Double.parseDouble(console.nextLine());
        double celsiusToFahFormula = celsius * 9 / 5 + 32;
        System.out.printf("%.2f",celsiusToFahFormula);
    }
}
