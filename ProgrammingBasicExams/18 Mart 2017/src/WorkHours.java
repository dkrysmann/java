import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorkHours {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double workHoursPerDay = 8;
        double workHoursNeeded = Double.parseDouble(reader.readLine());
        double workers = Double.parseDouble(reader.readLine());
        double workingDays = Double.parseDouble(reader.readLine());
        double projectFinish = workers * workingDays * workHoursPerDay;
        double penalties = (workHoursNeeded - projectFinish) * workingDays;
        if(projectFinish > workHoursNeeded){
            double success = projectFinish - workHoursNeeded;
            System.out.printf("%.0f hours left",success);
        }else{
            double failed = workHoursNeeded - projectFinish;
            System.out.printf("%.0f overtime",failed);
            System.out.println();
            System.out.printf("Penalties: %.0f",penalties);
        }

    }
}
