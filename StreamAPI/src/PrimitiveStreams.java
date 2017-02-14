import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class PrimitiveStreams {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> numbers = Arrays.asList(reader.readLine().split(" "));
        numbers.stream().mapToInt(n->Integer.valueOf(n)).forEach(n -> System.out.println(n));
    }
}
