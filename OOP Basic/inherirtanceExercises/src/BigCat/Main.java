package BigCat;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Lion lion = new Lion("M",60,"yellow");
        lion.printCat();
        AfricanLion africanLion = new AfricanLion("M",70,"brown");
        africanLion.printAfricanLion();
    }
}
