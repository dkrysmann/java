import java.util.Scanner;

public class ConvertFromBase7ToDec
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.next();
        Integer decimal = Integer.valueOf(num,7);
        System.out.println(decimal);

    }
}
