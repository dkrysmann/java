import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
       int[] arr = new int[a];
       arrElements(arr);
    }
    static int[] arrElements(int[] arr2){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr2.length; i++) {
           int n = in.nextInt();
           arr2[i]= n;
        }
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        return arr2;
    }
}
