import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int begin = Integer.parseInt(input.nextLine());
        int end = Integer.parseInt(input.nextLine());
        int combinations = Integer.parseInt(input.nextLine())-1;
        int counter = 0;
        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                if(counter==combinations){
                    combinations++;
                }
                         }
        }
        int res = begin + combinations;
        System.out.printf("Combination N: %d",combinations);
        System.out.println();
        System.out.printf("(" + begin + "+" + combinations + "=" + res + ")");
        System.out.printf("%d combinations - neither equals %d",combinations,combinations);
    }
}