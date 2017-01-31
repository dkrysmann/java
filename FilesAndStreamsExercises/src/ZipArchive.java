import java.io.*;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
public class ZipArchive {
    public static void main(String[] args) {
        String firstFileDir = null;
        String secondFileDir = null;
        String thirdFileDir = null;

        File firstFile = null;
        File secondFile = null;
        File thirdFile = null;

        File outputFile = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first file path: ");
        firstFileDir = scanner.nextLine();
        System.out.println("Enter second file path: ");
        secondFileDir = scanner.nextLine();
        System.out.println("Enter third file path: ");
        thirdFileDir = scanner.nextLine();

        firstFile = new File(firstFileDir);
        secondFile = new File(secondFileDir);
        thirdFile = new File(thirdFileDir);

        String newFileName = "files.zip";

        String outputFilePath = String.format("%s\\%s", firstFile.getParent(), newFileName);

        outputFile = new File(outputFilePath);

        try (FileInputStream firstIn = new FileInputStream(firstFile);
             FileInputStream secondIn = new FileInputStream(secondFile);
             FileInputStream thirdIn = new FileInputStream(thirdFile);
             ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outputFile))) {

            byte[] buffer = new byte[1024];
            int length;

            ZipEntry entry = new ZipEntry(firstFile.getName());
            out.putNextEntry(entry);
            while ((length = firstIn.read(buffer)) > 0)
                out.write(buffer, 0, length);

            entry = new ZipEntry(secondFile.getName());
            out.putNextEntry(entry);
            while ((length = secondIn.read(buffer)) > 0)
                out.write(buffer, 0, length);

            entry = new ZipEntry(thirdFile.getName());
            out.putNextEntry(entry);
            while ((length = thirdIn.read(buffer)) > 0)
                out.write(buffer, 0, length);

            System.out.println("Created new archive at: " + outputFilePath);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("[!] Dang! Better try again, pal... ");
        }
    }
}