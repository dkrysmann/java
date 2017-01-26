import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();
        hash.add("apple");
        hash.add("bananas");
        hash.add("kiwi");
        hash.add("pineapple");
        for (String s : hash) {
            System.out.println(s);
        }
    }
}
