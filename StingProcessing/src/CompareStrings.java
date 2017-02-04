import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String x = "10";
        if (input.equals(x)){
            System.out.println("Say Yes");
        }
    }
}
