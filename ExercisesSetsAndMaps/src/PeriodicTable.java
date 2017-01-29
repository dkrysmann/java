import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        TreeSet<String> container = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] elements = input.nextLine().split(" ");
            for (String element : elements) {
                container.add(element);
            }
        }
        for (String s : container) {
            System.out.printf("%s ",s);
        }
    }
}
