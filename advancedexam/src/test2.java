import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixSize = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        Integer[][] matrix = new Integer[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 0;
            }
        }

        String commandInput = scanner.nextLine();
        while (!commandInput.equals("Here We Go")){
            String[] toArray = commandInput.split(" ");
            int row1 = Integer.parseInt(toArray[0]);
            int col1 = Integer.parseInt(toArray[1]);
            int row2 = Integer.parseInt(toArray[2]);
            int col2 = Integer.parseInt(toArray[3]);

            for (int row = row1; row <= row2 ;row++) {
                for (int col = col1; col <= col2 ; col++) {
                    matrix[row][col] += 1;
                }
            }
            commandInput = scanner.nextLine();
        }
        for (Integer[] integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
