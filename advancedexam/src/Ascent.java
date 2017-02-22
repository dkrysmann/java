
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ascent {
    private static Map<String,String> decoder = new HashMap<>();
   private static Pattern pattern = Pattern.compile("([,])([A-Za-z]+)(\\d)");

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String msg = "";
        while (!"Ascending".equals(msg = reader.readLine())){
            decode(msg);
        }

    }

    private static void decode(String msg) {
        Matcher matcher = pattern.matcher(msg);
        for (String s : decoder.keySet()) {
            msg = matcher.group(s);
        }
    }
}
