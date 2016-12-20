import java.util.Scanner;

public class passwordGuess {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String phrase = "s3cr3t!P@ssw0rd";
        if(input.equals(phrase)){
            System.out.println("Welcome");
        }
        else{
            System.out.println("Wrong password!");
        }
    }
}
