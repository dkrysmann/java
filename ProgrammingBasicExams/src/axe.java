import java.util.Scanner;

public class axe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int width = 5 * n;
        int leftDashes = 3 * n;
        int midleDashes = 0;
        int rightDashes = width - leftDashes - 2;
        for (int i = 0; i < n; i++) {
            System.out.printf("%s*%s*%s%n",repeater("-",leftDashes),repeater("-",midleDashes),
                    repeater("-",rightDashes));
            midleDashes++;
            rightDashes--;
        }

        }
        static String repeater(String str,int counter){
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < counter; i++) {
                builder.append(str);
            }
            return builder.toString();
        }
    }
