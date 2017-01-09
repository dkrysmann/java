import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter how many numbers will be contains in the list:");
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Integer> data = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(input.nextLine());
            data.add(a);
        }
        Collections.sort(data);
        System.out.println("Numbers in Collection: " + data);
    }
}
