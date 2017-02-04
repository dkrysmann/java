import java.util.Scanner;

public class SimpleFormatting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 1;
        int b = 2;
        String result = String.format("One: %1$d Two: %2$d",a,b);
        String result1 = String.format("Two-%2$d One-%1$d",a,b);
        System.out.println(result);
        System.out.println(result1);
    }
}
