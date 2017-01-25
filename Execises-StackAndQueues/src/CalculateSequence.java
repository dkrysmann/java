import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class CalculateSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = Long.parseLong(input.nextLine());
        Deque<Long> sequence = new ArrayDeque<>();
        sequence.add(number);
        for (int i = 0; i < 50; i++) {
            Long getElement = sequence.poll();
            System.out.print(getElement + " ");
            long s2 = getElement+1;
            long s3 = 2*getElement+1;
            long s4 = getElement+2;

            sequence.add(s2);
            sequence.add(s3);
            sequence.add(s4);

        }
    }
}
