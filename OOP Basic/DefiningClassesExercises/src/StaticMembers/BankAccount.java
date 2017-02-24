package StaticMembers;


public class BankAccount {
    private static int accountsCounter;
    private int id;
    private String nameOfAccount;

    public int getId(){
        return this.id;
    }
    public String getNameOfAccount(){
        return this.nameOfAccount;
    }
    public BankAccount(int id,String nameOfAccount){
        this.id = ++accountsCounter;
        this.nameOfAccount = nameOfAccount;
    }

    @Override
    public String toString() {
        return "Id" + this.id;
    }
}
