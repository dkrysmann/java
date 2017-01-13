import java.util.Scanner;

public class numberFormatException {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a string:");
            String message = input.nextLine();
            System.out.println(message);
        }catch (NumberFormatException error){
            System.out.println("Not a string");
        }finally {
            System.out.println("ok");
        }
    }
}
