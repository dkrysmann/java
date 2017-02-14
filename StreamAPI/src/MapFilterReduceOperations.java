import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapFilterReduceOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> numbers = Arrays.asList(reader.readLine().split(" "));
        Optional<Integer> result = numbers.stream().map(x -> Integer.parseInt(x)).reduce((x, y)->x-y);
        System.out.println(result.get());
    }
}
