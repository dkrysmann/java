import java.util.InputMismatchException;
import java.util.Scanner;

public class demoExceptions {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.printf("Input a number: %n");
            int a = input.nextInt();
            System.out.println(a);
        }catch (InputMismatchException error){
            System.out.printf("Not a number%n");
        }finally {
            System.out.printf("finally block");
        }
    }
}
