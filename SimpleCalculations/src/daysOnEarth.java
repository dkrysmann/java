import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class daysOnEarth {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inputData = console.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate output = LocalDate.parse(inputData,formatter);
        output = output.plusDays(999);
        System.out.println(formatter.format(output));
    }
}
