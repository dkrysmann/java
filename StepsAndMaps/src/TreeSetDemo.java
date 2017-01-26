import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();
        tree.add("juice");
        tree.add("apple");
        tree.add("kiwi");
        tree.add("apple");
        tree.add("pineapple");
        tree.add("cocos");
        tree.add("cherry");
        tree.add("watermelon");
        for (String fruits : tree) {
            System.out.println(fruits);
        }
    }
}
