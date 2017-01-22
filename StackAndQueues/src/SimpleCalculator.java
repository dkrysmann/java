import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] tokens = input.nextLine().split(" ");
        ArrayDeque<String> elements = new ArrayDeque<>();
        Collections.addAll(elements,tokens);
        while (elements.size() > 1){
            Integer firstElement = Integer.valueOf(elements.pop());
            String operator = elements.pop();
            Integer secondElement = Integer.valueOf(elements.pop());
            if(operator.equals("+")){
                int sum = firstElement + secondElement;
                elements.push(String.valueOf(sum));
            }else{
                int substract = firstElement-secondElement;
                elements.push(String.valueOf(substract));
            }
        }
        System.out.println(elements.pop());
    }
}
