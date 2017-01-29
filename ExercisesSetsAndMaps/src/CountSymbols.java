import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeMap;


public class CountSymbols {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedHashMap<Character,Integer> container = new LinkedHashMap<>();
        char[] symbols = input.nextLine().toCharArray();
        for (char symbol : symbols) {
            if(!container.containsKey(symbol)){
                container.put(symbol,0);
            }
            container.put(symbol,container.get(symbol)+1);
        }
        for (char symbol : symbols) {
            System.out.println(symbol + ": " + container.get(symbol) + " time/s");
        }
    }
}
