import java.util.ArrayDeque;

public class Demo {
    public static void main(String[] args) {
        ArrayDeque<String> container = new ArrayDeque<>();
        container.push("One");
        container.push("Two");
        container.push("Three");
        container.push("Four");
        container.push("Five");
        System.out.println(container);
        System.out.println(container.getLast());
        System.out.println(container.getFirst());
    }
}
