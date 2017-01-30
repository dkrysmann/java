import java.io.File;
import java.util.ArrayDeque;

public class ListFilesAndFolders {
    public static void main(String[] args) {
        String strPath = "D:\\Files-and-Streams";
        File file = new File(strPath);
        ArrayDeque<File> queue = new ArrayDeque<>();
        queue.offer(file);
        int counter = 1;
        while (!queue.isEmpty()){
            File currentDir = queue.poll();
            File[] nestedFiles = currentDir.listFiles();
            for (File nestedFile : nestedFiles) {
                if(nestedFile.isDirectory()){
                    queue.offer(nestedFile);
                counter++;
                }
            }
            System.out.println(currentDir.getName());
        }
        System.out.println(counter + " " + "folders");
    }
}
