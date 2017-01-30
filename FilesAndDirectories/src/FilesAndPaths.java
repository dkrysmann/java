import com.sun.deploy.util.ArrayUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class FilesAndPaths {
    public static void main(String[] args) {
        String inputPath = "D:\\input.txt";
        String outputPath = "D:\\outputhPath.txt";

        Path path = Paths.get(inputPath);
        Path output = Paths.get(outputPath);
        try {
           List<String> lines = Files.readAllLines(path);
            Collections.sort(lines);
            Files.write(output,lines);
        } catch (IOException excpt) {
            excpt.printStackTrace();
        }
    }
}
