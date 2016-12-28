import java.util.Scanner;

public class christmasTree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n+1; i++) {
            System.out.println(upperSide(" ",n-i) + upperSide("*",i) + " | " + upperSide("*",i));
        }

    }
    static String upperSide(String pipe,int count){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(pipe);
        }
        return  builder.toString();
    }
}
