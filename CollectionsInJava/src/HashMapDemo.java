import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Double> grades = new HashMap<>();
       viewGrades(grades);
    }
    static void viewGrades(HashMap<String,Double> grades){
        grades.put("Pesho",6.00);
        grades.put("Stamat",5.45);
        grades.put("SahilJay",4.30);
        grades.put("Minka",3.00);
        grades.put("Unufri",2.00);
        System.out.println(grades);
    }
}
