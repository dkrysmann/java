import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UpperStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        List<String> names = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            names.add(String.valueOf(input[i]));
        }
        names.stream().map(x->x.toUpperCase()).forEach(x-> System.out.print(x + " "));
    }
}
