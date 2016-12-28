import java.util.Scanner;

public class squareOfstars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println(ptintStars("*",n));

        }
    }
    static String ptintStars(String star,int count){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(star);
            builder.append(" ");
        }
        return builder.toString();
    }
}
