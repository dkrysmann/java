import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hoursNeeded = Integer.parseInt(input.nextLine());
        int daysNeeded = Integer.parseInt(input.nextLine());
        int overtimeWorkers = Integer.parseInt(input.nextLine());
        double hoursForProject = (daysNeeded - (daysNeeded * 0.1)) * 8;
        double plusOvertime = overtimeWorkers *(2 * daysNeeded);
        double total = Math.floor(hoursForProject + plusOvertime);
        if(total >= hoursNeeded){
            int diff = (int)total - hoursNeeded;
            System.out.println("Yes!" + diff + " " + "hours left.");
        }
        else{
            int diff = hoursNeeded - (int)total;
            System.out.println("Not enough time!" + diff + " " + "hours needed.");
        }
    }
}
