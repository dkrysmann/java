import javafx.scene.control.SpinnerValueFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidTime {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2}) [AP]M$");
        String lineInput = reader.readLine();
        while (!lineInput.equals("END")){
            Matcher matcher = pattern.matcher(lineInput);
            if(matcher.find()){
                int hour = Integer.valueOf(matcher.group(1));
                int minutes = Integer.valueOf(matcher.group(2));
                int seconds = Integer.valueOf(matcher.group(3));
            if(checkValid(hour,minutes,seconds)){
                System.out.println("valid");
            }else{
                System.out.println("invalid");
            }
            }else{
                System.out.println("invalid");
            }
            lineInput = reader.readLine();
        }
    }
    public static boolean checkValid(int hour,int minutes,int seconds){
            if(!(1<= hour && hour<=12)){
                return false;
            }
            if(!(0<= minutes && minutes <= 59)){
                return false;
            }
            if(!(0<=seconds&&seconds <= 59)){
                return false;
            }
            return true;
    }
}
