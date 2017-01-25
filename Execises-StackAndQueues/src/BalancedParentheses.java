
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Deque<Character> container = new ArrayDeque<>();
        boolean isBalanced = true;
       char[] braces = input.nextLine().toCharArray();
       if(braces.length%2 != 0){
           System.out.println("NO");
           return;
       }
        for (char brace : braces) {
            if(brace=='{' || brace == '[' || brace == '('){
                container.push(brace);
            }else{
              char currentBrace = container.pop();
               if(brace == '}'){
                   brace = '{';
               }
               if(brace == ']'){
                   brace='[';
               }
                if(brace == ')'){
                    brace='(';
                }
                if(brace!=currentBrace){
                    System.out.println("NO");
                    isBalanced = false;
                    break;
                }
            }
        }
        if(isBalanced){
            System.out.println("YES");
        }
    }
}
