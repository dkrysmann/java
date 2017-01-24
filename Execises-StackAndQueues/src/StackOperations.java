import java.util.ArrayDeque;
import java.util.Scanner;

public class StackOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] checker = input.nextLine().split(" ");
        int n = Integer.parseInt(checker[0]);
        int s = Integer.parseInt(checker[1]);
        String numberAvailable = checker[2];
        String[] numberStringed = input.nextLine().split(" ");
        ArrayDeque<String> container = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            container.push(numberStringed[i]);
        }
        for (int i = 0; i < s; i++) {
            container.pop();
        }
        int minValue = Integer.MAX_VALUE;
        for (String s1 : container) {
            int current = Integer.parseInt(s1);
            if (current < minValue) {
                minValue = current;
                if (s1.equals(numberAvailable)) {
                    System.out.println(true);
                    return;
                }
            }
            if (container.size() == 0) {
                System.out.println(0);
            } else {
                System.out.println(minValue);
            }
        }
    }
}