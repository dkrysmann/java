import java.util.Scanner;

public class rectangleOfNxN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println(printRectangle("*",n));
        }

    }
    static String printRectangle(String star,int count){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(star);
        }
        return builder.toString();
    }
}
