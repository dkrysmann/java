import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = Integer.parseInt(input.nextLine());
        int treated = 0;
        int untreated = 0;
        int doctors = 7;
        for (int i = 1; i <= days; i++) {
            int patients = Integer.parseInt(input.nextLine());
            if((i % 3 == 0 ) && (untreated > treated)){
                doctors++;
            }
            if(patients > doctors){
                treated += doctors;
                untreated += patients - doctors;
            }
            else{
                treated += patients;
            }
        }
        System.out.printf("Treated patients: %d. %n",treated);
        System.out.printf("Untreated patients: %d.",untreated);
    }
}
