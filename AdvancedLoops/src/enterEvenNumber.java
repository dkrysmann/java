import java.util.Scanner;

public class enterEvenNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = 0;
        while (true) {
            try {
                System.out.print("Enter even number: ");
                n = Integer.parseInt(console.nextLine());
                if (n % 2 == 0) {
                    break;
                } else {
                    System.out.println("The number is not even: " + n);
                }
            }
            catch (NumberFormatException exception) {
                System.out.println("Invalid number");
            }
        }
        System.out.println("Even number entered: " + n);
    }
}
