import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int parseNum = scan.nextInt();
            System.out.println(parseNum);
        }catch (InputMismatchException error){
            System.out.println("Invalid number");
        }
        finally {
            System.out.println("Finally block!");
        }
    }
}
