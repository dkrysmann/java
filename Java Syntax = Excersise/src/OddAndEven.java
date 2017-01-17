import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class OddAndEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String add = input.nextLine();
       String[] numbers = input.nextLine().split(" ");
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = add;
        }
        String joined = String.join(" ",numbers);
        System.out.println(joined);
    }
}
