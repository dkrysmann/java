import java.util.ArrayList;
import java.util.Scanner;

public class joinElementInArrList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<String> animals = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String addAnimal = input.nextLine();
            animals.add(addAnimal);
        }
        String joined = String.join("---",animals);
        System.out.println(joined);
    }
}
