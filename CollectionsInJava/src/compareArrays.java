import java.util.*;
import java.util.Arrays;

public class compareArrays {
    public static void main(String[] args) {
        //this will check index positions
        double[] number = {3.14,1.06,9.8};
        double[] number1 = {3.14,1.06,9.8};
        System.out.println(java.util.Arrays.equals(number,number1));
        //Sort in ASC order
        Arrays.sort(number1);
        for (double num : number1) {
            System.out.println(num);
        }
    }
}
