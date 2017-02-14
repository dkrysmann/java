import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoundedNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split(" ");
        List<Integer> container = Stream.of(numbers).map(n->Integer.parseInt(n)).sorted().collect(Collectors.toList());
        Stream.of(numbers).map(x->Integer.parseInt(x)).filter(x->container.get(0) <= x && x <= container.get(1))
                .forEach(x-> System.out.print(x + " "));
    }
}
