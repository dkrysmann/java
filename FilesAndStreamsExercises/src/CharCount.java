import java.io.*;
import java.util.HashSet;

public class CharCount {
    private static HashSet<Character> VOWELS = new HashSet<>();
    private static HashSet<Character> PUNCTUATION = new HashSet<>();

    static {
        VOWELS.add('a');
        VOWELS.add('A');
        VOWELS.add('e');
        VOWELS.add('E');
        VOWELS.add('i');
        VOWELS.add('I');
        VOWELS.add('o');
        VOWELS.add('O');
        VOWELS.add('u');
        VOWELS.add('U');

        PUNCTUATION.add('!');
        PUNCTUATION.add(',');
        PUNCTUATION.add('.');
        PUNCTUATION.add('?');
    }

    public static void main(String[] args) {
        String inputFilePath = null;
        File inputFile = null;
        File outputFile = null;

        long vowels = 0;
        long consonants = 0;
        long punctuation = 0;

        System.out.println("Enter path to file: ");

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            inputFilePath = console.readLine();
            inputFile = new File(inputFilePath);

            String inputFileName = inputFile.getName().substring(0, inputFile.getName().indexOf('.'));
            String newFileName = String.format("%s-CHARTYPES.txt", inputFileName);
            String outputFilePath = String.format("%s\\%s", inputFile.getParent(), newFileName);

            outputFile = new File(outputFilePath);

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 PrintWriter writer = new PrintWriter(outputFile)) {

                int code = reader.read();
                while (code != -1) {
                    char currentChar = (char) code;

                    if (VOWELS.contains(currentChar))
                        vowels++;
                    else if (PUNCTUATION.contains(currentChar))
                        punctuation++;
                    else
                        consonants++;

                    code = reader.read();
                }

                writer.println("Vowels: " + vowels);
                writer.println("Consonants: " + consonants);
                writer.println("Punctuation: " + punctuation);

                System.out.println("File created at: " + outputFilePath);
            } catch (Exception e) {
                System.out.println("[!] Very descriptive critical error message [!]");
            }

        } catch (Exception e) {
            System.out.println("[!] Very descriptive critical error message [!]");
        }
    }
}