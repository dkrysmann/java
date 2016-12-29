import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        checker(n);
    }
    static int checker(int num) {
        boolean isPrime = true;
        if (num < 2) {
           isPrime = false;
        } else {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime) {
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }
            // System.out.println(num);
        }
        return num;
    }
}
