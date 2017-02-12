import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceATag {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder input = new StringBuilder();
        String line ="";
        while (!line.equals("END")){
            input.append(line).append(System.lineSeparator());
            line = reader.readLine();
        }
        Pattern regex = Pattern.compile("<a\\s+(href=[^>]+)>([^<]+)</a>");
        Matcher matcher = regex.matcher(input.toString());
        while (matcher.find()){
            int startMatch = matcher.start();
            int endMatch = matcher.start() + matcher.group(0).length();
            String replacement =cretateReplacement(matcher);
            input.replace(startMatch,endMatch,replacement);
        }
        System.out.println(input);
    }
    public static String cretateReplacement(Matcher matcher){
        return "[URL " + matcher.group(1) + "]" + matcher.group(2) + "[/URL]";
    }
}
