import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = reader.readLine();
        Pattern searchPatern = Pattern.compile("^\\+359([- ])2\\1\\d{3}\\1\\d{4}$");
        while (!inputText.equals("end")) {
            Matcher patternMatch = searchPatern.matcher(inputText);
           if (patternMatch.find()){
               System.out.println(inputText);
           }
            inputText = reader.readLine();
        }
    }
}