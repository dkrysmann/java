import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        greatestCommonDivisior(a,b);
    }
    static int greatestCommonDivisior(int a,int b){
        while (b != 0){
            int oldB = b;
            b = a % b;
            a = oldB;
        }
        System.out.println(a);
        return a;
    }
}
