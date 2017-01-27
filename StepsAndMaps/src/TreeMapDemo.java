import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,String> phoneNumbers = new TreeMap<>();
        phoneNumbers.put("Gruio","44558899");
        phoneNumbers.put("Gelendrin","0055887799");
        phoneNumbers.put("Arhalandi","1002233");
        phoneNumbers.put("Stamat","778899");
        phoneNumbers.put("Lisa Ann","**445588");
        phoneNumbers.put("ApostolVtori","4545454");
        phoneNumbers.put("Lisa Ann","**445588");
        phoneNumbers.put("Aralandi","232323");
        for (String s : phoneNumbers.keySet()) {
            System.out.println(s + " " + phoneNumbers.get(s));
        }
    }
}
