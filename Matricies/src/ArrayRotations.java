import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRotations {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] separator = reader.readLine().split(" ");
        int arrSize = Integer.parseInt(separator[0]);
        int rotationSteps = Integer.parseInt(separator[1]);
        String[] box = reader.readLine().split(" ");
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[(i + rotationSteps) % arrSize] = Integer.parseInt(box[i]);
        }
        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
