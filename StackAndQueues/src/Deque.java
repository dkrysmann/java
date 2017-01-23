import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.push(2);
        deque.add(3);
        deque.push(1);
        System.out.println(deque);
        int element1 = deque.remove();
        System.out.printf("Removed %d%n",element1);
        System.out.printf("Remaining elements %s",deque);

    }
}
