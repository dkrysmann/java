import java.util.HashMap;

public class PhoeNumbers {
    public static void main(String[] args) {
        HashMap<String,String> phonebook = new HashMap<>();
        phonebook.put("Stamat","123456789");
        phonebook.put("Sahil Jay","0258733");
        phonebook.put("Unufri","445533111");
        printNumbers(phonebook);
    }
    public static void printNumbers(HashMap<String,String> getNumbers){
        for (String num : getNumbers.keySet()) {
            System.out.println(num + " " + getNumbers.get(num));
        }
    }
}
