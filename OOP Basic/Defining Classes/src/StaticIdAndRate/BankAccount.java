package StaticIdAndRate;

public class BankAccount {
    private static final double DEFAULT_INTEREST_RATE = 0.02;

    private static int accountsCounter;
    private static double currentInterestRate = DEFAULT_INTEREST_RATE;

    private int id;
    private double balance;
    public BankAccount(){
       this.id = ++accountsCounter;
    }
    public int getId(){
        return this.id;
    }
    public static void setInterestRate(double interestRate){
        currentInterestRate = interestRate;
    }
    public double getInterestRare(int years){
        return this.balance * currentInterestRate * years;
    }
    @Override
    public String toString() {
        return "ID" + this.id;
    }
}
