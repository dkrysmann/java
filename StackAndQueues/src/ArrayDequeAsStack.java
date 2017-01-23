import java.util.ArrayDeque;

public class ArrayDequeAsStack {
    public static void main(String[] args) {
        ArrayDeque<String> names = new ArrayDeque<>();
        names.push("Stamat");
        names.push("John");
        names.push("Jack");
        System.out.println(names);
        System.out.println(names.remove());
    }
}
