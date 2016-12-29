import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num1 = Integer.parseInt(input.nextLine());
      int num2 = Integer.parseInt(input.nextLine());
      calculation(num1,num2);
    }
    static int calculation(int a,int b){
        int result = a + b;
        System.out.println("The result is = " + result);
        return result;
    }
}
