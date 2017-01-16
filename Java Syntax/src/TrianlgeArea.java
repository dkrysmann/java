import java.util.Scanner;

public class TrianlgeArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        calcTriangleArea(base,height);
    }
    static double calcTriangleArea(double base,double height){
        double area = (base * height) / 2;
        System.out.printf("Area = %.2f",area);
        return area;
    }
}
