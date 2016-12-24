import java.util.Scanner;

public class personalTitle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double age = Double.parseDouble(console.nextLine());
        String sex = console.nextLine();
        if(sex.equals("m") && age >=16){
            System.out.println("Mr.");
        }
        else if(sex.equals("m") && age < 16){
            System.out.println("Master");
        }
        else if(sex.equals("f") && age >= 16){
            System.out.println("Ms.");
        }
        else{
                System.out.println("Miss");
            }
        }
    }
