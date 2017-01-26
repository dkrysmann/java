import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Pesho");
        names.add("Gosho");
        names.add("Stamat");
        names.add("Sam Doe");
        names.add("Unufri");
        names.add("Pesho");
        for (String name : names) {
            System.out.println(name);
        }
        names.add("Goshko");
        names.size();
        System.out.println(names);
    }
}
