import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class TakeTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.valueOf(input[i]));
        }
        LinkedHashSet<Integer> res = new LinkedHashSet<>();
        for (Integer num : numbers) {
            if(res.size()>=2){
                break;
            }
            if(10 <= num && num <=20){
                res.add(num);
            }
        }
        System.out.println(res);
    }
}
