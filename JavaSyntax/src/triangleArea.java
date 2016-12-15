import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter triangle width:");
        double width = input.nextDouble();
        System.out.println("enter a triangle height:");
        double height = input.nextDouble();
        calcTriangleArea(width,height);
    }
    static double calcTriangleArea(double width,double height){
        double area = width * height / 2;
        System.out.println("Area =" + area);
        return area;
    }
}
