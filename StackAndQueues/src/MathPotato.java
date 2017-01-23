import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] addChildren = input.nextLine().split(" ");
        int n = Integer.parseInt(input.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue,addChildren);
        int counter = 1;
        while (queue.size() > 1){
            for (int i = 1; i < n; i++) {
                String firstChild = queue.remove();
                queue.offer(firstChild);
            }
            if(primeChecker(counter)) {
                System.out.println("Prime " + queue.peek());
            }
            else{
                System.out.println("Removed " + queue.remove());
            }
            counter++;
        }
        System.out.println("Last is " + queue.peek());
    }
    static boolean primeChecker(int num){
        if(num <=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
