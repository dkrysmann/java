import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    //    String hello = "Hello";
        String firstName = input.nextLine();
        String lastName = input.nextLine();
        if(firstName.isEmpty()){
            firstName = "*****";
            System.out.println("Hello" + "," + " " + firstName + " " + lastName + "!");
        }
        else if(lastName.isEmpty()){
            lastName = "*****";
            System.out.println("Hello" + "," + " " + firstName + " " + lastName + "!");
        }
        else if(firstName.isEmpty() && lastName.isEmpty()){
            firstName = "*****";
            lastName = "*****";
            System.out.println("Hello" + "," + " " + firstName + " " + lastName + "!");
        }
        else {
            System.out.println("Hello" + "," + " " + firstName + " " + lastName + "!");
        }
    }
}
