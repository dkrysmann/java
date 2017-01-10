import java.util.Scanner;

public class MaxCombinations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int begin = Integer.parseInt(input.nextLine());
        int end = Integer.parseInt(input.nextLine());
        int combinations = Integer.parseInt(input.nextLine());
        int counter = 0;
        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                if(counter==combinations){
                    break;
                }
                System.out.print("<"+i+"-"+j+">");
                counter++;
            }
        }
    }
}
