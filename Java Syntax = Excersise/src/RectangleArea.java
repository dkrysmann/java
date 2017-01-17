import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        calcRectangleArea(a,b);
    }
    public static double calcRectangleArea(double a,double b){
        double area = a*b;
        System.out.printf("%.2f",area);
        return area;
    }
}
