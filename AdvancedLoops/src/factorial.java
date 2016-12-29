import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        factorialCalc(a);
    }

    static int factorialCalc(int count) {
        int factorial = 1;
        for (int i = 1; i <= count; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return factorial;
    }
}
