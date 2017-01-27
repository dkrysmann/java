import java.util.HashMap;
import java.util.Scanner;

public class CountSameValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] spliter = input.nextLine().split(" ");
        HashMap<String,Integer> numbers = new HashMap<>();
        for (int i = 0; i < spliter.length; i++) {
            if(!numbers.containsKey(spliter[i])){
                numbers.put(spliter[i],1);
            }else{
                numbers.put(spliter[i],numbers.get(spliter[i])+1);
            }
        }
        for (String s : numbers.keySet()) {
            System.out.println(s + " - " + numbers.get(s) + " times");
        }
    }
}
