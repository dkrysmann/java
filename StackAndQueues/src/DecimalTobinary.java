import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalTobinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        ArrayDeque<Integer> container = new ArrayDeque<>();
        if (num != 0) {
            while (num != 0) {
                container.push(num % 2);
                num /= 2;
            }
            while (!container.isEmpty()) {
                System.out.print(container.pop());
            }

        } else {
            System.out.println(0);
        }
    }
}
