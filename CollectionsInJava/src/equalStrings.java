import java.util.Scanner;
import java.util.Arrays;
public class equalStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
       String[] words = new String[num];
        for (int i = 0; i < words.length; i++) {
            String add = input.nextLine();
            words[i] = add;
        }
        String joined = String.join(" ",words);
        System.out.println(joined);
    }
}
