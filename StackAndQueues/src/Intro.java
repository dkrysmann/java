import java.util.ArrayDeque;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayDeque<String> addToDeque = new ArrayDeque<>();
      addToDeque.push("Pesho");
      addToDeque.push("Stamat");
       addToDeque.push("Unufri");
        System.out.println(addToDeque.peek());
        System.out.println(addToDeque.pop());
        System.out.println(addToDeque.peek());
    }
}
