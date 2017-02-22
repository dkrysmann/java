package BankAccount;


public class BankAccountOpt {
    private int Id;
    private double balance;

    //Setter for Id
    public void setId(int Id){
        this.Id = Id;
    }
    //Getter for balance
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        if(amount > this.balance){
            throw new IllegalStateException("Not enough money");
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "ID" + this.Id;
    }
}
