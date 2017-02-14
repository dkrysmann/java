import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TakeTwoStream {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.valueOf(input[i]));
        }
        numbers.stream().distinct().filter(x->10 <= x && x <= 20).limit(2).forEach(x-> System.out.print(x + " "));
    }
}
