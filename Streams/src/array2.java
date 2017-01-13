import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[]arr = new int[n];
        printElements(arr);
    }
    static int[] printElements(int[]array1){
        Scanner num = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            int n = Integer.parseInt(num.nextLine());
            array1[i]=n;
        }
        Arrays.sort(array1);

        System.out.println(Arrays.toString(array1));
        return array1;
    }
}
