import java.util.TreeSet;

public class TreeSetDemoNames {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Ned");
        names.add("Anatoli");
        names.add("Slav");
        names.add("Stamat");
        names.add("Unufri");
        names.add("Pesho");
        names.add("Anatoli");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
