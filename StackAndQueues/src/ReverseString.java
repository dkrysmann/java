import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        ArrayDeque<Character> reversed = new ArrayDeque<>();
        reverseString(reversed);
    }
    public static void reverseString(ArrayDeque<Character> insert){
        Scanner input = new Scanner(System.in);
        String addToStack = input.nextLine();
        for (Character character :addToStack.toCharArray()) {
            insert.push(character);
        }
        while (!insert.isEmpty()){
            System.out.print(insert.pop());
        }
    }
}
