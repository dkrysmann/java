
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int commands = Integer.parseInt(input.nextLine());
        Deque<Integer> container = new ArrayDeque<>();
        Deque<Integer> maxNumbers = new ArrayDeque<>();
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < commands; i++) {
            String[] commandInput = input.nextLine().split(" ");
            int command = Integer.parseInt(commandInput[0]);
            if (command == 1) {
                int number = Integer.parseInt(commandInput[1]);
                if (number >= maxElement) {
                    maxElement = number;
                    maxNumbers.push(maxElement);
                }
                container.push(number);
            }
           else if (command == 2) {
                int deletedItem = container.pop();
                if (deletedItem == maxElement) {
                    maxNumbers.pop();
                    if (!maxNumbers.isEmpty()) {
                        maxElement = maxNumbers.peek();
                    }
                    else{
                        maxElement = Integer.MIN_VALUE;
                    }
                }
            }
             if(command == 3) {
                System.out.println(maxNumbers.peek());
            }
        }
    }
}