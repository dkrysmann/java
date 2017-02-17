import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommandInterpreter {
    private static List<String> result;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        result = new ArrayList<>(Arrays.asList(reader.readLine().split("\\s+")));
        String[] commandInput = reader.readLine().split(" ");
        while (!commandInput[0].equals("end")) {
            switch (commandInput[0]) {
                case "reverse":
                    reverseCommand(Long.parseLong(commandInput[2]), Long.parseLong(commandInput[4]));
                    break;
                case "sort":
                    sortCommand(Long.parseLong(commandInput[2]), Long.parseLong(commandInput[4]));
                    break;
                case "rollLeft":
                    rollLeftCommand(Long.parseLong(commandInput[1]));
                    break;
                case "rollRight":
                    rollRightCommand(Long.parseLong(commandInput[1]));
                    break;
                default:
                    break;
            }

            commandInput = reader.readLine().split("\\s+");
        }
        System.out.println(result);
    }

    public static void rollRightCommand(Long count) {
        try {
            if(count <0) {
                System.out.println("Invalid input parameters");
                return;
            }
            count %= result.size();
            for (long i = 0; i < count; i++) {
                String reminder = result.get(result.size() - 1);
                result.remove(result.size() - 1);
                result.add(0, reminder);
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Invalid input parameters");
        }
    }

    public static void rollLeftCommand(long count) {
        try {
            if(count < 0) {
                System.out.println("Invalid input parameters");
                return;
            }
            count %= result.size();
            for (long i = 0; i < count; i++) {
                String reminder = result.get(0);
                result.remove(0);
                result.add(reminder);
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Invalid input parameters");
        }
    }

    public static void sortCommand(long startIndex, long count) {
            try {
                if (count < 0 || startIndex < 0) {
                    System.out.println("Invalid input parameters");
                    return;
                }

            long endIndex = startIndex + count;
            ArrayList<String> reminder = new ArrayList<>(result.subList((int)startIndex, (int)endIndex));
            Collections.sort(reminder);
            for (long i = startIndex; i < endIndex; i++) {
                result.set((int)i, reminder.get((int)(i - startIndex)));
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Invalid input parameters.");
        }
    }

    public static void reverseCommand(long startIndex, long count) {
        try {
            if (count < 0 || startIndex < 0) {
                System.out.println("Invalid input parameters");
                return;
            }
            long endIndex = startIndex + count;
            ArrayList<String> reminder = new ArrayList<>(result.subList((int)startIndex, (int)endIndex));
            Collections.reverse(reminder);
            for (long i = startIndex; i < endIndex; i++) {
                result.set((int)i, reminder.get((int)(i - startIndex)));
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Invalid input parameters");
        }
    }
}
