import java.util.Scanner;

public class checkPoint {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());
        check(x1,y1,x2,y2,x,y);
    }
    static void check(double x1,double y1,double x2,double y2,double x,double y){
        if(x >= x1 && x <= x2 && y >= y1 && y <= y2){
            System.out.println("Inside");
        }
        else{
            System.out.println("Outside");
        }
    }
}
