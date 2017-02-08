import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTags {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern searchPatern = Pattern.compile("<.+?>");
        String text = reader.readLine();
        while (!text.equals("END")){
            Matcher paternMatcher = searchPatern.matcher(text);
            while (paternMatcher.find()){
                System.out.println(paternMatcher.group());
            }
          text = reader.readLine();
        }
    }
}
