package PersonClass;


public class TestAccount {
    private int id;
    private double balance;

    public void setId(int id){
        this.id = id;
    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amount){
        if(amount < 0){
            throw  new IllegalArgumentException("Amount should be positive");
        }
        this.balance += amount;
    }
    public void withdraw(double amount){
        if(amount > this.balance){
            throw new IllegalStateException("Insufficient balance");
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "ID" + this.id;
    }
}
