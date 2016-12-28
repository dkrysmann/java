import java.util.Scanner;

public class sqaureFrame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        System.out.println("+ " + upSide("- ",n-2) + "+");
        for (int i = 0; i < n-2; i++) {
            System.out.println("| " + middleSide("- ",n-2) + "|");
        }
        System.out.println("+ " + downSide("- ",n-2) + "+");
    }
    static String upSide(String up,int count){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(up);
        }
        return builder.toString();
    }
    static  String middleSide(String pipe,int count){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(pipe);
        }
        return builder.toString();
    }
    static String downSide(String down,int count){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(down);
        }
        return builder.toString();
    }
}
