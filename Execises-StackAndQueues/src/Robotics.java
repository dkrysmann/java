import java.util.ArrayDeque;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] robotTokens = input.nextLine().split(" ");
        String[] robots = new String[robotTokens.length];
        int[] procesTimes = new int[robotTokens.length];
        int[] counter = new int[robotTokens.length];
        for (int i = 0; i < robotTokens.length; i++) {
            String[] eachRobotToken = robotTokens[i].split("-");
            robots[i] = eachRobotToken[0];
            procesTimes[i] = Integer.parseInt(eachRobotToken[1]);
        }
        String[] time = input.nextLine().split(":");
        long hours = Integer.parseInt(time[0])*60*60;
        long min = Integer.parseInt(time[1]) * 60;
        long sec = Integer.parseInt(time[2]);
        long seconds = hours + min + sec;
        ArrayDeque<String> products = new ArrayDeque<>();
        String product = "";
        while (!"End".equals(product = input.nextLine())){
            products.add(product);
        }
        while (!products.isEmpty()){
            for (int i = 0; i <robots.length ; i++) {
                if(counter[i] > 0){
                    counter[i] --;
                }
            }
            String getCurrentProduct = products.pop();
            boolean isProductTaken = false;
            for (int i = 0; i < robots.length; i++) {
                if(counter[i] == 0){
                    counter[i] = procesTimes[i];
                    isProductTaken = true;
                    System.out.printf("%s - %s [%s]%n",robots[i],getCurrentProduct,convertSecondsToHMmSs(seconds));
                    break;
                }
            }
            if (!isProductTaken){
                products.add(getCurrentProduct);
            }
        }
    }
    static String convertSecondsToHMmSs(long seconds){
        long s = seconds % 60;
        long m = (seconds / 60) % 60;
        long h = (seconds / (60*60) % 24);
        return String.format("%02d:%02d:%02d",h,m,s);
    }
}
