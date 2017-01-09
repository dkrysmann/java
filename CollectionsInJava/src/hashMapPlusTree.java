import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Arrays;

public class hashMapPlusTree {
    public static void main(String[] args) {
        HashMap<String,TreeMap<String,ArrayList<Double>>> students = new HashMap<>();
        students.put("Pesho",new TreeMap<>());
        students.put("Stamat", new TreeMap<>());
        students.get("Pesho").put("Java Fundamentals",new ArrayList<>());
        students.get("Pesho").get("Java Fundamentals").addAll(Arrays.asList(5.50,4.5,6.00));
        System.out.println(students.get("Pesho"));
    }
}
