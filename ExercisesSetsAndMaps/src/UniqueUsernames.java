import java.util.LinkedHashSet;
import java.util.Scanner;


public class UniqueUsernames {
    public static void main(String[] args) {

        LinkedHashSet<String> container = new LinkedHashSet<>();
        addElements(container);
        printElements(container);
    }
    public static LinkedHashSet<String> addElements(LinkedHashSet<String>holder){
        Scanner input = new Scanner(System.in);
       int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            String name = input.nextLine();
            holder.add(name);
        }
        return holder;
    }
    public static void printElements(LinkedHashSet<String> holder){
        for (String s : holder) {
            System.out.println(s);
        }
    }
}