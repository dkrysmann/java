package Money;


public class Dollars implements Countable {
    private double usDollar;

    public Dollars(double usDollar) {
        this.usDollar = usDollar;
    }

    private double getUsDollar() {
        return this.usDollar;
    }

    private void setUsDollar(double usDollar) {
        this.usDollar = usDollar;
    }
    public void addMoney(double money){
        this.usDollar += money;
    }

    @Override
    public void count() {
        System.out.printf("Dollars - %s",this.getUsDollar());
    }
}
