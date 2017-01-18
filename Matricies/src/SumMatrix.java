import java.util.Scanner;

public class SumMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] box = input.nextLine().split(", ");
        int[][] numbers = new int[Integer.parseInt(box[0])][Integer.parseInt(box[1])];
        for (int row = 0; row < numbers.length; row++) {
            String[] delimeter = input.nextLine().split(", ");
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = Integer.parseInt(delimeter[col]);
            }
        }
        System.out.println(numbers.length);
        System.out.println(numbers[0].length);
        int sum = 0;
        for (int[] number : numbers) {
            for (int i : number) {
                sum += i;
                //   System.out.print(i+", ");
                //    System.out.println();
            }
        }
        System.out.println(sum);
    }
}
