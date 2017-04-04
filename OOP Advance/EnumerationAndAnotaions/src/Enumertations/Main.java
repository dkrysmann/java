package Enumertations;



public class Main {
    public static void main(String[] args) {
      Season[] seasons = Season.values();
        printSeason(seasons);
        getOrdinal(seasons);

    }
    public static void printSeason(Season[] seasons){
        for (Season season : seasons) {
            System.out.println("Season is " + season.toString().toLowerCase());
        }
    }
    public static void getOrdinal(Season[] seasons){
        for (Season season : seasons) {
            System.out.println(season.ordinal());
        }
    }
}
