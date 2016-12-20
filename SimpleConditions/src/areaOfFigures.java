import java.util.Scanner;

public class areaOfFigures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String figure = console.nextLine();
        switch (figure){
            case "square":
                double a = Double.parseDouble(console.nextLine());
                areaOfSquare(a);
                break;
            case "rectangle":
                double w = Double.parseDouble(console.nextLine());
                double h = Double.parseDouble(console.nextLine());
                rectangleArea(w,h);
                break;
            case "circle":
                double r = Double.parseDouble(console.nextLine());
                circleArea(r);
                break;
            case "triangle":
                double b = Double.parseDouble(console.nextLine());
                double h1 = Double.parseDouble(console.nextLine());
                triangleArea(b,h1);
                break;
                default:
                    break;
        }
    }
    static double areaOfSquare(double a){
        double area = a * a;
        System.out.println(area);
        return area;
    }
    static double rectangleArea(double w,double h){
        double area = w * h;
        System.out.println(area);
        return area;
    }
    static void circleArea(double r){
        double area = Math.PI * r * r;
        System.out.printf("%.3f",area);
    }
    static double triangleArea(double b,double h){
        double area = b * h / 2;
        System.out.println(area);
        return area;
    }
}
