import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        String[] spliter = input.nextLine().split(", ");
        String pattern = input.nextLine();
    }
    public static void A(int n,int sizeOfMatrix[][]){
       int currentNum = 1;
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                sizeOfMatrix[col][row] = currentNum;
                currentNum++;
            }
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(sizeOfMatrix[col][row] + " ");
            }
            System.out.println();
        }
    }
    public static void B(int n,int sizeOfMatrix[][]){
        int currentNum=1;
        for (int col = 0; col < n; col++) {
            if(col%2 == 0){
                for (int row = 0; row <n; row++) {
                    sizeOfMatrix[col][row] = currentNum;
                    currentNum++;
                }
            }
            else{
                for (int row = n-1; row >=0; row--) {
                    sizeOfMatrix[col][row] = currentNum;
                    currentNum++;
                }
            }
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(sizeOfMatrix[col][row] + " ");
            }
            System.out.println();
        }
    }
}
