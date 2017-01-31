import java.io.*;

public class CopyPicture {
    public static void main(String[] args) {
        String filePath = null;
        File file = null;
        File outputFile = null;

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter path to picture file: ");

            filePath = console.readLine();

            file = new File(filePath);

            String fileName = file.getName().substring(0, file.getName().indexOf('.'));
            String extension = file.getName().substring(file.getName().indexOf('.'));

            String newFileName = String.format("%s-copy%s", fileName, extension);

            String outputFilePath = String.format("%s\\%s", file.getParent(), newFileName);

            outputFile = new File(outputFilePath);

            try (FileInputStream fis = new FileInputStream(file);
                 FileOutputStream fos = new FileOutputStream(outputFile)) {

                byte[] buffer = new byte[1024];

                int length;
                while ((length = fis.read(buffer)) > 0) {
                    fos.write(buffer, 0, length);
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