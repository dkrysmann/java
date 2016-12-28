import java.util.Scanner;

public class rhombusOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int space = n - 1;
        int star = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(printStars(" ",space) + printStars("* ",star));
            space--;
            star++;
        }
        space = 1;
        star -= 2;
        for (int i = 0; i < n; i++) {
            System.out.println(printStars(" ",space) + printStars("* ",star));
            space++;
            star--;
        }

    }
    static String printStars(String star,int count){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(star);
        }
        return builder.toString();
    }
}
