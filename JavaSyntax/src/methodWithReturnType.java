import java.util.Scanner;

public class methodWithReturnType {
    public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int a = console.nextInt();
             System.out.println(isEven(a));
    }
    static boolean isEven(int isEvenNumber){
        if(isEvenNumber % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
