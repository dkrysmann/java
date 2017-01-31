import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {
        String inputFilePath = null;
        File inputFile = null;
        File outputFile = null;

        System.out.println("Enter path to file: ");

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            inputFilePath = console.readLine();
            inputFile = new File(inputFilePath);

            String inputFileName = inputFile.getName().substring(0, inputFile.getName().indexOf('.'));
            String newFileName = String.format("%s-ALLCAPITALS.txt", inputFileName);
            String outputFilePath = String.format("%s\\%s", inputFile.getParent(), newFileName);

            outputFile = new File(outputFilePath);

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 PrintWriter writer = new PrintWriter(outputFile)) {

                int code = reader.read();
                while (code != -1) {
                    writer.write(Character.toUpperCase((char) code));
                    code = reader.read();
                }

                System.out.println("File created at: " + outputFilePath);
            } catch (Exception e) {
                System.out.println("[!] Very descriptive critical error message [!]");
            }

        } catch (Exception e) {
            System.out.println("[!] Very descriptive critical error message [!]");
        }
    }
}
