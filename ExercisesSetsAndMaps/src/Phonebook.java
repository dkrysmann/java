import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String,String> phonebook = new HashMap<>();
        while (true){
            String command = input.nextLine();
            if(command.equals("search")){
                break;
            }
            String[] phone = command.split("-");
            phonebook.put(phone[0],phone[1]);
        }
        while (true){
            String command = input.nextLine();
            if(command.equals("stop")){
                break;
            }
            if(phonebook.containsKey(command)){
                System.out.printf("%s -> %s%n",command,phonebook.get(command));
            }else{
                System.out.printf("Contact %s does not exist.%n",command);
            }
        }
    }
}
