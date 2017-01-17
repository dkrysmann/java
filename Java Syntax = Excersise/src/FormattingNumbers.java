
import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstnumber = input.nextInt();
        double secondNumbers = input.nextDouble();
        double thirdNumber = input.nextDouble();
        input.nextLine();
        String binary = Integer.toBinaryString(firstnumber);
        String toHex = Integer.toHexString(firstnumber);
        String paddedZero = String.format("%010d",Integer.parseInt(binary));
        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",toHex.toUpperCase(),paddedZero,secondNumbers,thirdNumber);
    }
}
