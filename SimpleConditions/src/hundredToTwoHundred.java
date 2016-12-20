import java.util.Scanner;

public class hundredToTwoHundred {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        if(a < 100){
            System.out.println("Less than 100");
        }
        else if(a >= 100 && a <= 200){
            System.out.println("Between 100 and 200");
        }
        else{
            System.out.println("Greater than 200");
        }
    }
}
