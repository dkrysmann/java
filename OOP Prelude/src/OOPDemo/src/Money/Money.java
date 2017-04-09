package Money;

public class Money implements Countable {
    private double value;

    public Money(double value){
        this.value = value;
    }


    private double getValue(){
        return this.value;
    }
    private void setValue(double value){
        this.value = value;
    }
    public void addMoney(double money){
        this.value += money;
    }

    @Override
    public void count() {
        System.out.printf("Money - %s",this.getValue());
    }
}
