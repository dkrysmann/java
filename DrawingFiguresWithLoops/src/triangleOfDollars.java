import java.util.Scanner;

public class triangleOfDollars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println(pritnDollars("$",i));
        }
    }
    static String pritnDollars(String dollars,int count){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= count; i++) {
            builder.append(dollars).append(" ");
        }
        return builder.toString();
    }
}
