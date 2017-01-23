import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] children = input.nextLine().split(" ");
        int n = Integer.parseInt(input.nextLine());
        ArrayDeque<String> queu = new ArrayDeque<>();
        Collections.addAll(queu,children);
        while (queu.size() > 1){
            for (int i = 1; i < n; i++) {
                String firstChild = queu.poll();
                queu.offer(firstChild);
            }
            System.out.println("Removed " + queu.poll());
        }
        System.out.println("Last is " + queu.poll());
    }
}
