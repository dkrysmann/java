import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FunctionExecution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            result.add(Integer.valueOf(input[i]));
        }
        result.stream().filter(x->x > 4).map(x->x*2).forEach(x-> System.out.println(x));
    }
}
