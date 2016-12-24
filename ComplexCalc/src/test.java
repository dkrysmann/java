import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        String lastNasme = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        String town = console.nextLine();
        System.out.printf("you are %s %s from %s.Youre age is %d",name,lastNasme,town,age);
    }
}
