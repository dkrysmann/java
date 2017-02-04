import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseUrls {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] protocolSplit = input.split("://");
        if(protocolSplit.length != 2){
            System.out.println("Invalid URL");
        }else {
            System.out.println(String.format("Protocol = %s",protocolSplit[0]));
            int index = protocolSplit[1].indexOf("/");
            String server = String.format("Server = %s",protocolSplit[1].substring(0,index));
            System.out.println(server);
            String resources =String.format("Resources = %s",protocolSplit[1].substring(index+1));
            System.out.println(resources);
        }
    }
}
