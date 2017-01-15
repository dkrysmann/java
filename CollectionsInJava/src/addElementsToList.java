
import java.util.ArrayList;
import java.util.Scanner;

public class addElementsToList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        addNumbers(a);
    }
    static ArrayList<Integer> addNumbers(int number){
        Scanner input = new Scanner(System.in);
      ArrayList<Integer> collection = new ArrayList<>(number);
        for (int i = 0; i < number; i++) {
            int a = Integer.parseInt(input.nextLine());
            collection.add(a);
        }
        System.out.println(collection);
        return collection;
    }

}
