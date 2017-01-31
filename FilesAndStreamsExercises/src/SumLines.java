import java.io.*;

public class SumLines {
    private final static String path = "/src/resources.txt";
    public static void main(String[] args) {
        String inputFilePath = null;
        File inputFile = null;
        long sum = 0;
        StringBuilder output = new StringBuilder("");

        System.out.println("Enter path to file: ");

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            inputFilePath = console.readLine();
            inputFile = new File(inputFilePath);

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
                String line = reader.readLine();
                while (line != null) {
                    for (char c : line.toCharArray())
                        sum += c;

                    output.append(line)
                            .append('\n')
                            .append('[').append(sum).append(']')
                            .append('\n').append('\n');

                    sum = 0;
                    line = reader.readLine();
                }
                System.out.print(output);
            } catch (Exception e) {
                System.out.println("[!] Very descriptive critical error message [!]");
            }

        } catch (Exception e) {
            System.out.println("[!] Very descriptive critical error message [!]");
        }
    }
}