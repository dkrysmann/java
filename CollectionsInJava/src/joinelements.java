import java.util.Scanner;

public class joinelements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        String[] elements = new String[a];
        for (int i = 0; i <elements.length ; i++) {
            String ins = input.nextLine();
            elements[i] = ins;
        }
        String joined = String.join("...",elements);
        System.out.println(joined);
    }
}
