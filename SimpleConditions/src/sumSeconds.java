import java.util.Scanner;

public class sumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstRide = Integer.parseInt(console.nextLine());
        int secondRider = Integer.parseInt(console.nextLine());
        int thirdRider = Integer.parseInt(console.nextLine());
        int seconds = firstRide + secondRider + thirdRider;
        int oneMinute = 60;
        int res = seconds / oneMinute;
        if(res < 59){
            System.out.println(res + ":" + seconds);
        }

    }
}