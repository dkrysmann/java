import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arr[][] = new int[6][6];
        for (int row = 0; row < 6; row++) {
           String[] rowBox = reader.readLine().split(" ");
            for (int col = 0; col < arr[row].length; col++) {
               arr[row][col] = Integer.parseInt(rowBox[col]);
            }
        }
        printMarix(arr);
        System.out.println(maxHourGlass(arr));
    }
    public static void printMarix(int arr[][]){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
    public static int maxHourGlass(int arr[][]){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row <= 3; row++) {
            for (int col = 0; col <= 3; col++) {
                    int sum = findSum(arr,row,col);
                    max = Math.max(max,sum);
            }
        }
        return max;
    }
    public static int findSum(int[][] arr,int row,int col){
        int sum = arr[row+0][col+0] + arr[row+0][col+1] + arr[row+0][col+2]
                +arr[row+1][col+1] + arr[row+2][col+0] + arr[row+2][col+1] + arr[row+2][col+2];
        return sum;
    }
}
