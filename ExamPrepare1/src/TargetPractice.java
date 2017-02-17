import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TargetPractice {
    //declare matrix
    private static String[][] matrix;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //split by space
        String[] sizes = reader.readLine().split(" ");

        //Create matrix
        matrix = new String[Integer.parseInt(sizes[0])][Integer.parseInt(sizes[1])];
        String snakeMovement = reader.readLine();
        fillMatrix(snakeMovement);
        System.out.println(matrix);
        String[] command = reader.readLine().trim().split(" ");
        shotMatrix(command);
        printMatrix();
    }

    private static void shotMatrix(String[] command) {
        int impactRow = Integer.parseInt(command[0]);
        int impactCol = Integer.parseInt(command[1]);
        int radius = Integer.parseInt(command[2]);


    }

    private static void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void fillMatrix(String snakeMovement) {
       StringBuilder builder = new StringBuilder(snakeMovement);
       boolean isMovingLeft = true;
        for (int row = matrix.length-1; row >=0 ; row--) {
            if(isMovingLeft){
                for (int col = matrix[0].length-1; col >= 0; col--) {
                    matrix[row][col] = String.valueOf(builder.charAt(0));
                    builder.append(matrix[row][col]);
                    builder.deleteCharAt(0);
                }
                isMovingLeft = false;
            }else{
                for (int col = 0; col < matrix[0].length; col++) {
                    matrix[row][col] = String.valueOf(builder.charAt(0));
                }
                isMovingLeft = true;
            }
        }
    }
}
