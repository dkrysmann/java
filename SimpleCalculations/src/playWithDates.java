import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class playWithDates {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         String date = console.nextLine();
         LocalDate localDate = LocalDate.parse(date,formatter);

        System.out.println(localDate); //default print ISO_LOCALE_DATE
        System.out.println(formatter.format(localDate));
    }
}
