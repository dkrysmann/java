import java.util.Scanner;

public class areaOfRect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = scan.nextDouble();
        double height = scan.nextDouble();
        rectangleArea(width,height);
    }
    static double rectangleArea(double width,double height){
       double area = width * height;
        System.out.println("Rectangle Area = " + area);
        return area;
    }

}
