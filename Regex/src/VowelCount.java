import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        Pattern serchPatern = Pattern.compile("[AEIOUYaeiouy]");
        Matcher patternMatch = serchPatern.matcher(text);
        int countMatcher = 0;
        while (patternMatch.find()){
            countMatcher++;
        }
        System.out.println("Non-digits: " + countMatcher);
    }
}
