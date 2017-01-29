import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] sizeSet = input.nextLine().split(" ");
        LinkedHashSet<Integer> firstCollection = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondCollection = new LinkedHashSet<>();
        int firstNum = Integer.parseInt(sizeSet[0]);
        int secondNum = Integer.parseInt(sizeSet[1]);
        for (int i = 0; i < firstNum; i++) {
            int n = Integer.parseInt(input.nextLine());
            firstCollection.add(n);
        }
        for (int i = 0; i < secondNum; i++) {
            int n = Integer.parseInt(input.nextLine());
            secondCollection.add(n);
        }
        for (Integer numberInFirstCollection : firstCollection) {
            if(secondCollection.contains(numberInFirstCollection)){
                System.out.printf("%d ",numberInFirstCollection);
            }
        }

    }
}
