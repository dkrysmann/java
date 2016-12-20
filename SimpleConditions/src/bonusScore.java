import java.util.Scanner;

public class bonusScore {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num = Double.parseDouble(console.nextLine());
        double scores = 0;
        if(num <= 100){
            scores += 5;
        }
        else if((num > 100) && (num <= 1000)){
            scores += num * 0.2;
        }
        else{
            scores += num * 0.1;
        }
         if(num % 2 == 0){
            scores += 1;
        }
         if(num % 10 == 5){
            scores += 2;
        }
        System.out.println(scores);
        System.out.println(scores + num);
    }
}

