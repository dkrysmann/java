import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        sumDigits(n);
    }
    static int sumDigits(int input){
        int sum = 0;
        do{
            int lastDigit = input % 10;
            sum+=lastDigit;
            input /= 10;
        }
        while (input > 0);
        System.out.println(sum);
        return sum;
    }
}
