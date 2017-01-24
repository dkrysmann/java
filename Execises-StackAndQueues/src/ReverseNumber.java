
import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String[] elements = input.nextLine().split(" ");
       ArrayDeque<String> container = new ArrayDeque<>();
        for (int i = 0; i < elements.length; i++) {
            container.push(elements[i]);
        }
        while (!container.isEmpty()){
            System.out.print(container.pop() + " ");
        }
    }
}
