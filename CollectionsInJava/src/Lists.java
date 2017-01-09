import java.util.*;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(55.02);
        doubleList.add(2.44);
        doubleList.add(2.44);
        doubleList.add(787.00);
     //   doubleList.removeAll(java.util.Arrays.asList(2.44));
        doubleList.remove(1);
        System.out.println(doubleList);
        doubleList.set(0,55.055);
        doubleList.set(1,788.00);
        System.out.println(doubleList);
    }
}
