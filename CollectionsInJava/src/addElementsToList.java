
import java.util.ArrayList;
import java.util.Scanner;

public class addElementsToList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        addNumbers(a);
    }
   public static void addNumbers(int num){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(input.nextLine());
            numbers.add(a);
        }
        printNumbers(numbers);
          //  printEvenNumbers(numbers);
    }
    public static void printEvenNumbers(ArrayList<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
        System.out.println(numbers);
    }
   public static void printNumbers(ArrayList<Integer>numbers){
        System.out.println(numbers);
    }

}
