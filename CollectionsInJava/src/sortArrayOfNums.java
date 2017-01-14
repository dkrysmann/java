import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sortArrayOfNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Integer> nums = new ArrayList<>(n);
        for (int i = 0; i < n ; i++) {
            int b = Integer.parseInt(input.nextLine());
            nums.add(b);
        }
        Collections.sort(nums);
        for (Integer S:nums){
            System.out.print(S + " ");
        }
    }
}
