import java.util.Scanner;
import java.util.Arrays;
public class methodsDemo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        printNumbers(num);
    }
   public static int[] printNumbers(int add){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[add];
        for (int i = 0; i < arr.length; i++) {
            int a = Integer.parseInt(input.nextLine());
            arr[i] = a;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
