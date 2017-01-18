import java.nio.channels.InterruptedByTimeoutException;
import java.util.ArrayList;
import java.util.Scanner;

public class GetFirstOddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> addNumbers = new ArrayList<>();
        AddnumbersToList(addNumbers);
        GetFirstEvenNums(addNumbers);
    }
    public static void AddnumbersToList(ArrayList<Integer> addNumbersToList){
        Scanner input = new Scanner(System.in);
        String[]numbers = input.nextLine().split(" ");
        for (int i = 0; i < addNumbersToList.size(); i++) {
            addNumbersToList.add(Integer.parseInt(numbers[i]));
        }
        String join = String.join(" ",numbers);
        System.out.println(join);
    }
    public static void GetFirstEvenNums(ArrayList<Integer>addNumbersToList){
        int couner = 0;
        for (int i = 0; i < addNumbersToList.size(); i++) {
            if(addNumbersToList.size() % 2 == 0){
                System.out.println(addNumbersToList.get(i) + " ");
                couner++;
            }
        }
    }
}
