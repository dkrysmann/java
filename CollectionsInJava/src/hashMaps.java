import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class hashMaps {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Double>> students = new HashMap<>();
        students.put("Stamat", new ArrayList<>());
        students.put("Pesho", new ArrayList<>());
        students.put("Minka", new ArrayList<>());

        students.get("Pesho").addAll(Arrays.asList(2.3,5.00,6.00));
        students.get("Stamat").addAll(Arrays.asList(3.11,5.50,3.22));
        students.get("Minka").addAll(Arrays.asList(5.50,4.00,5.20));

        ArrayList<Double> stamatsGrades = students.get("Stamat");
        System.out.println(stamatsGrades);
        stamatsGrades.remove(0);
        stamatsGrades.add(0,6.00);
        stamatsGrades.add(2,5.00);
        stamatsGrades.remove(3.22);
        System.out.println(stamatsGrades);
    }

}
