import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SpecialWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] specialWords = reader.readLine().split(" ");
        String[] text = reader.readLine().split(" ");
        HashMap<String,Integer> result = new HashMap<>();
        for (String specialWord : specialWords) {
            for (String s : text) {
                if(specialWord.compareToIgnoreCase(s) == 0){
                    if(result.containsKey(specialWord)){
                        result.put(specialWord,result.get(specialWord)+1);
                    }else{
                        result.put(specialWord,1);
                    }
                }
            }
        }
        for (String s : result.keySet()) {
            System.out.println(s + " - " + result.get(s));
        }
    }
}
