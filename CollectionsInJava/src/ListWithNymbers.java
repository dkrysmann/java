import java.util.ArrayList;
import java.util.Scanner;

public class ListWithNymbers {
    public static void main(String[] args) {

        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(4.5);
        doubleList.add(4.3);
        doubleList.add(5.6);
        doubleList.add(2.1);
        doubleList.add(3.0);
        System.out.println(doubleList);
        doubleList.remove(0);
        System.out.println(doubleList);
        System.out.println(doubleList.get(2));
        System.out.println(doubleList.get(0));
    }
}
