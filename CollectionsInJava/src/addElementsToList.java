
import java.util.ArrayList;
import java.util.Scanner;

public class addElementsToList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        addNumbers(a);
    }
    public static void addNumbers(int n){
        ArrayList<Integer> numbers = new ArrayList<>(n);
        printNumbers(n, numbers);
    }

    public static void printNumbers(int n, ArrayList<Integer> numbers) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(input.nextLine());
            numbers.add(a);
        }
        System.out.println(numbers);
    }

}
