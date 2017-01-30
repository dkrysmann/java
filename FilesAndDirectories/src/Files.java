import java.io.File;

public class Files {
    public static void main(String[] args) {
        String strPath = "D:\\Files-and-Streams";
        File file = new File(strPath);
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File f : files) {
                if(!f.isDirectory()){
                    System.out.printf("%s: %s%n",f.getName(),f.length());
                }
            }
        }
    }
}
