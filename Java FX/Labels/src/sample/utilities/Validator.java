package utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final Pattern PATTERN_VALID_NAME = Pattern.compile("^[\\w+]$");

    public static boolean nameIsValid(String name) {
        Matcher matcher = PATTERN_VALID_NAME.matcher(name);
        return matcher.matches();
    }
}
