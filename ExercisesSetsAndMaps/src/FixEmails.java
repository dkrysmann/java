import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String,String> container = new HashMap<>();
        ArrayList<String> noValidMails =new ArrayList<>(Arrays.asList(".uk",".us",".com"));
        while (true){
            String nameOfPerson = input.nextLine();
            if(nameOfPerson.equals("stop")){
                break;
            }
            String mailAdres = input.nextLine();
            if(!container.containsValue(noValidMails)){
                container.put(nameOfPerson,mailAdres);
            }
            container.put(nameOfPerson,container.get(nameOfPerson));
        }
        for (String s : container.keySet()) {
            System.out.printf("%s -> %s%n",s,container.get(s));
        }
    }
}
