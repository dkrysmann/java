import java.util.Scanner;

public class equalWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstWord = console.nextLine().toLowerCase();
        String secondWord = console.nextLine().toLowerCase();
       boolean isEquals = firstWord.equals(secondWord);
       if(isEquals){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
    }
}
