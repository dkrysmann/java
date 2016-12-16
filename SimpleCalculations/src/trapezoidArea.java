import java.util.Scanner;

public class trapezoidArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double b1 = Double.parseDouble(console.nextLine());
        double b2 = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());
        areaTrapezoid(b1,b2,h);
    }
    static double areaTrapezoid(double b1,double b2,double h){
        double area = (b1 + b2) * h /2;
        System.out.println(area);
        return area;
    }
}
