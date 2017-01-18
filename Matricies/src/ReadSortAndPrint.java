import java.util.Arrays;
import java.util.Scanner;

public class ReadSortAndPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        String[] arr = new String[a];
        for (int i = 0; i < arr.length; i++) {
           String name = input.nextLine();
           arr[i] = name;
        }
        Arrays.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
