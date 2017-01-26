import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> vehicles = new HashMap<>();
        vehicles.put("BMW",5);
        vehicles.put("Mercedes",320);
        vehicles.put("Ford Mondeo",4);
        vehicles.put("BMW",10);
        for (String key: vehicles.keySet()) {
            System.out.println(key + " " + vehicles.get(key));
        }
    }
}
