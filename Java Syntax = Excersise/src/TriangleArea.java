import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Ax = Double.parseDouble(input.nextLine());
        double Ay = Double.parseDouble(input.nextLine());

        double Bx = Double.parseDouble(input.nextLine());
        double By = Double.parseDouble(input.nextLine());

        double Cx =  Double.parseDouble(input.nextLine());
        double Cy =  Double.parseDouble(input.nextLine());
        calculateArea(Ax,Ay,Bx,By,Cx,Cy);
    }
    static double calculateArea(double Ax,double Ay,double Bx,double By,double Cx,double Cy){
        double area = Ax * (By-Cy) + Bx * (Cy - Ay) + Cx * (Ay - By) / 2;
        System.out.printf("%.0f",area);
        return area;
    }
}
