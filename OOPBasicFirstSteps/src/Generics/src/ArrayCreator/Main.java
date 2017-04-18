package ArrayCreator;


public class Main {
    public static void main(String[] args) {
      Integer[] dataInt = ArrCreator.create(Integer.class,5,10);
      String[] dataStr = ArrCreator.create(String.class,4,"words");
        System.out.println(dataInt.length);
        System.out.println(dataStr.length);
    }
}
