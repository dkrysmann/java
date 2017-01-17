import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Ax = input.nextInt();
        int Ay = input.nextInt();
        input.nextLine();
        int Bx = input.nextInt();
        int By = input.nextInt();
        input.nextLine();
        int Cx = input.nextInt();
        int Cy = input.nextInt();
        calculateArea(Ax,Ay,Bx,By,Cx,Cy);
    }
    static double calculateArea(int Ax,int Ay,int Bx,int By,int Cx,int Cy){
        double area = Math.abs(Ax * (By-Cy) + Bx * (Cy - Ay) + Cx * (Ay - By)) / 2;
        System.out.printf("%.0f",area);
        return area;
    }
}
