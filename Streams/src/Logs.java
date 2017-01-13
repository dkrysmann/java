import java.io.*;

public class Logs {
    public static void main(String[] args) {

      String filePath = "D://projects/Java/Streams/users.txt";
        File file = new File(filePath);
       try(BufferedReader reader = new BufferedReader(new FileReader(file))){
           String line = reader.readLine();
           while (line!=null){
               line = reader.readLine();
           }
           String[] lineArgs = line.split(" ");
           String usernames = lineArgs[0];
           int totalMinutes = 0;
           for (int i = 0; i < lineArgs.length; i++) {
               String[] loogedTime = lineArgs[i].split(":");
               int hours = Integer.parseInt(loogedTime[0]);
               int minutes = Integer.parseInt(loogedTime[1]);
               totalMinutes += (hours*60) + minutes;
           }
           String savePath = "D://projects/Java/Streams/total-time.txt";
           FileWriter writer = new FileWriter(savePath,true);
           PrintWriter print = new PrintWriter(writer,true);
           reader.close();
           writer.close();
        }catch (IOException err){
          System.out.println("Error");
        }

    }
}
