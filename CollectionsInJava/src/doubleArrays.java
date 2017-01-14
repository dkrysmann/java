
import java.util.*;
import java.util.Arrays;

public class doubleArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        double[] elements = new double[n];
        int[] integerElements = new int[n];
        generateNumbers(elements);
        generateIntegerNumbers(integerElements);
    }
    public static double[] generateNumbers(double[]arr){
        Scanner num = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            double a = Double.parseDouble(num.nextLine());
            arr[i] = a;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static int[] generateIntegerNumbers(int[] arrInt){
        Scanner enter = new Scanner(System.in);
        for (int i = 0; i < arrInt.length; i++) {
            int a = Integer.parseInt(enter.nextLine());
            arrInt[i] = a;
        }
        System.out.println(Arrays.toString(arrInt));
        return arrInt;
    }
}
