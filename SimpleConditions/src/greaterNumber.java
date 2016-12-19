import java.util.Scanner;

public class greaterNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num1 = Double.parseDouble(console.nextLine());
        double num2 = Double.parseDouble(console.nextLine());
        if(num1 > num2){
            System.out.println(num1);
        }
        else if(num1 < num2){
            System.out.println(num2);
        }
        else if(num1 == num2){
            System.out.println(num1);
        }
    }
}
