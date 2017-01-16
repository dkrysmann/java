import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersUtil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = getNumberByScanner(scanner);
        List<Integer> insertedNumbers = insertNNumbers(scanner, numbersCount);
        printNumbers(insertedNumbers);
        printNumbersType(insertedNumbers);
    }
    private static List<Integer> insertNNumbers(Scanner scanner, int num){
        List<Integer> numbersList = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            numbersList.add(getNumberByScanner(scanner));
        }
        return numbersList;
    }

    private static void printNumbersType(List<Integer> numbers){
        for (Integer number : numbers) {
            System.out.println(number % 2 == 0 ? "Even" : "Odd");
        }
    }

    private static int getNumberByScanner(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    private static void printNumbers(List<Integer>numbers){
        System.out.println(numbers);
    }
}
