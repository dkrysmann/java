import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expr = input.nextLine();
        ArrayDeque<Integer> elements = new ArrayDeque<>();
        for (int i = 0; i < expr.length(); i++) {
            char symbol = expr.charAt(i);
            if(symbol == '('){
                elements.push(i);
            }else if(symbol == ')'){
                int startIndex = elements.pop();
                String substr = expr.substring(startIndex,i+1);
                System.out.println(substr);
            }
        }
    }
}
