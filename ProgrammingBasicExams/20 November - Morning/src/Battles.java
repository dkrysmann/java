import java.util.Scanner;

public class Battles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pokemonPlayer1 = Integer.parseInt(input.nextLine());
        int pokemonPlayer2 = Integer.parseInt(input.nextLine());
        int battles = Integer.parseInt(input.nextLine());
        int counter = 0;
        for (int i = 1; i <= pokemonPlayer1; i++) {
            for (int j = 1; j <= pokemonPlayer2 ; j++) {
                if(counter == battles){
                    break;
                }
                System.out.print("("+i+ " " + "<" +"-" +">" + " " +j+") ");
                counter++;
            }
        }
    }
}
