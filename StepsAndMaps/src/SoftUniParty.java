
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<String> regular = new HashSet<>();
        TreeSet<String> vip = new TreeSet<>();
        while (true){
            String insert = input.nextLine();
            if(insert.equals("PARTY")){
                break;
            }
            if(!Character.isDigit(insert.charAt(0))){
                regular.add(insert);
            }else{
                vip.add(insert);
            }
        }
        while (true){
            String guestComming = input.nextLine();
            if(guestComming.equals("END")){
                break;
            }
            if(Character.isDigit(guestComming.charAt(0))){
                vip.remove(guestComming);
            }else{
                regular.remove(guestComming);
            }
        }
        vip.addAll(regular);
        System.out.println(vip.size());
        for (String s : vip) {
            System.out.println(s);
        }
    }
}
