import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] box = input.nextLine().split(" ");
        int[][] inputNumbers = new int[Integer.parseInt(box[0])][Integer.parseInt(box[1])];
        for (int row = 0; row < inputNumbers.length; row++) {
            String[] delimeter = input.nextLine().split(", ");
            for (int col = 0; col < inputNumbers[row].length; col++) {
                inputNumbers[row][col] = Integer.parseInt(delimeter[col]);
            }
        }
        int sumMax = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;
        for (int row = 0; row < inputNumbers.length-1; row++) {
            for (int col = 0; col < inputNumbers[0].length-1; col++) {
                int currentSum = inputNumbers[row][col] + inputNumbers[row][col]
                        + inputNumbers[row + 1][col] + inputNumbers[row+1][col]+
                        inputNumbers[row+1][col+1];
                if(currentSum > sumMax){
                    sumMax = currentSum;
                    startRow = row;
                    startCol = col;
                }
            }
        }
        System.out.println(inputNumbers[startRow][startCol] + " " +  inputNumbers[startRow][startCol] +1);
        System.out.println(inputNumbers[startRow+1][startCol] + " " +  inputNumbers[startRow+1][startCol] +1);
        System.out.println(sumMax);
    }
}
