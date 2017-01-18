import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArr {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4,5,6},
        };
        for (int[] ints : matrix) {
            System.out.println(Arrays.deepToString(matrix));
        }
    }
}
