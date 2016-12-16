import java.util.Scanner;

public class squareArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("a = ");
        double a = Double.parseDouble(scan.nextLine());
       square(a);
    }
    static double square(double a){
        double area = a * a;
        System.out.println(area);
        return area;
    }
}
