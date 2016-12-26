import java.util.Scanner;

public class vowelSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word = console.nextLine();
        int sum = 0;
        for (int i = 0; i <= word.length()-1;i++) {
            char currentLetter = word.charAt(i);
            if(currentLetter == 'a'){
                sum+=1;
            }
            else if(currentLetter == 'e'){
                sum+=2;
            }
            else if(currentLetter == 'i'){
                sum+=3;
            }
            else if(currentLetter == 'o'){
                sum+=4;
            }
            else if(currentLetter == 'u'){
                sum+=5;
            }
        }
        System.out.println(sum);
    }
}
