import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            int input = Integer.parseInt(console.nextLine());
            sum += input;
        }
        System.out.println(sum);
    }
}
