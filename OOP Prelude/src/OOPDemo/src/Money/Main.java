package Money;

public class Main {
    public static void main(String[] args) {
      Money money = new Money(100);
      money.addMoney(10);
      money.count();
        System.out.println();
      Dollars dollars = new Dollars(200);
      dollars.addMoney(20);
      dollars.count();
    }
}
