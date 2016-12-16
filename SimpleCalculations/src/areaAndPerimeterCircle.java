import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class areaAndPerimeterCircle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double r = Double.parseDouble(console.nextLine());
        area(r);
        perimeter(r);
    }
    static double area (double r){
        double areaOfCirce = Math.PI * r * r;
        DecimalFormat df = new DecimalFormat("#.#############");
        System.out.println(df.format(areaOfCirce));
        return areaOfCirce;
    }
    static double perimeter(double r){
        double perimeterOfCircle = 2 * Math.PI * r;
        DecimalFormat per = new DecimalFormat("#.#############");
        System.out.println(per.format(perimeterOfCircle));
        return perimeterOfCircle;
    }
}