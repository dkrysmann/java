import java.util.Scanner;

public class ConvertFromDecimalToBase7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        System.out.println(Integer.toString(num,7));
    }
}
