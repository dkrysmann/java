import java.util.Scanner;

public class sumDigit2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        sumDigits(n);
    }
    static int sumDigits(int num){
        int sum = 0;
        for (int i = num; i >= 0; i--) {
            int lastDigit = num % 10;
            sum+=lastDigit;
            num /= 10;
        }
        System.out.println(sum);
        return sum;
    }
}
