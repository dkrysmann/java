import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class StackOperations {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       ArrayDeque<Integer> container = new ArrayDeque<>();
       String[] commandsArg = input.nextLine().split(" ");
       String[] index = input.nextLine().split(" ");
        for (int command = 0; command < commandsArg.length; command++) {
           switch (command){
               case 0:
                   for (int i = 0; i < commandsArg.length; i++) {
                       int numPush = Integer.valueOf(index[0]);
                       container.push(numPush);
                   }
                   break;
               case 1:
                   for (int i = 0; i < Integer.valueOf(commandsArg[1]); i++) {
                       container.pop();
                   }
                   break;
               case 2:
                   int availableNumInStack = Integer.valueOf(commandsArg[2]);
                   if(container.contains(availableNumInStack)){
                       System.out.println("true");
                   }else{
                       if(container.isEmpty()){
                           System.out.println(0);
                           return;
                       }
                   }
           }
        }
    }
}