import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstString = input.next();
      String secondString = input.next();
       Long totalSum = multiplyingCharacters(firstString,secondString);
        System.out.println(totalSum);
    }
    public static long multiplyingCharacters(String firstStr,String secondStr){
        long sum = 0L;
        for (int i = 0; i < firstStr.length(); i++) {
           sum += firstStr.charAt(i)*secondStr.charAt(i);
        }
        sum += calcRemaningChars(firstStr,secondStr);
        return sum;
    }
    public static long calcRemaningChars(String firsStr,String secondStr){
        long remainder = 0L;
       if(firsStr.length() > secondStr.length()){
           String remainingChars = firsStr.substring(secondStr.length());
           for (int i = 0; i < remainingChars.length(); i++) {
               remainder+=remainingChars.charAt(i);
           }
       }else if(firsStr.length() < secondStr.length()){
           String remainingChars = secondStr.substring(firsStr.length());
           for (int i = 0; i < remainingChars.length(); i++) {
               remainder+=remainingChars.charAt(i);
           }
       }
       return remainder;
    }
}
