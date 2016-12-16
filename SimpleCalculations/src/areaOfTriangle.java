import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());
        area(a,h);
    }
    static double area(double a,double h){
        double areaOfTriangle = a * h / 2;
        System.out.printf("Triangle area = %.2f", areaOfTriangle);
        return areaOfTriangle;
    }
}
