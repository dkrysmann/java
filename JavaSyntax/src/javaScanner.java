import java.util.Scanner;

public class javaScanner {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = console.nextInt();
       int num2 = console.nextInt();
        System.out.println(num1 + num2);
        String firstName = console.next();
        String lastName = console.next();
        System.out.println(firstName);
        System.out.println(lastName);
    }
}

