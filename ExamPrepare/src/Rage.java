import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rage {
    private static HashSet<Character> chars = new HashSet<>();
    private static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        Pattern pattern = Pattern.compile("(\\D+)(\\d+)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            int count = Integer.parseInt(matcher.group(2));
            String str = matcher.group(1).toUpperCase();
            if (count != 0) {
                for (int i = 0; i < str.length(); i++) {
                    chars.add(str.charAt(i));
                }
                for (int i = 0; i < count; i++) {
                    builder.append(str);
                }
            }
        }
        System.out.println("Unique symbols used: " + chars.size());
        System.out.println(builder);
    }
}