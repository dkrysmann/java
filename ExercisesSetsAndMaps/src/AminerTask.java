import java.util.HashMap;
import java.util.Scanner;

public class AminerTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String,Long> collection = new HashMap<>();
        while (true){
            String product = input.nextLine();
            if (product.equals("stop")){
                break;
            }
           Long value = Long.parseLong(input.nextLine());
            if(!collection.containsKey(product)){
                collection.put(product,0L);
            }
            collection.put(product,collection.get(product)+value);
        }
        for (String productWithValue : collection.keySet()) {
            System.out.printf("%s -> %s%n",productWithValue,collection.get(productWithValue));
        }
    }
}
