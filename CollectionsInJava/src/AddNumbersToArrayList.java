import java.util.ArrayList;
import java.util.Scanner;

public class AddNumbersToArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber = Integer.parseInt(input.nextLine());
        ArrayList<Integer> numbersInCollection = addNumberToArr(inputNumber);
        printNumber(numbersInCollection);
        printTypeOfNumber(numbersInCollection);
    }
    static ArrayList<Integer> addNumberToArr(int n){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(input.nextLine());
            numbers.add(a);
        }
        return numbers;
    }
    static void printTypeOfNumber(ArrayList<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++) {
            if(i % 2 == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
    public static void printNumber(ArrayList<Integer> numbers){
        System.out.println(numbers);
    }

}
