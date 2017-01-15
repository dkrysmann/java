
import java.util.ArrayList;
import java.util.Scanner;

public class addElementsToList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        addNumbers(a);
    }
    static void addNumbers(int num){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(input.nextLine());
            numbers.add(a);
        }
        printNumbers(numbers);
    }
    static void printNumbers(ArrayList<Integer>numbers){
        System.out.println(numbers);
    }

}
