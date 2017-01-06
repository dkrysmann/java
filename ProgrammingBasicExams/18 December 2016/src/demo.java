import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        simpleCalculation(a,b);
    }
    static int simpleCalculation(int num,int num1){
        System.out.println(num * num1);
        return num * num1;
    }
}
