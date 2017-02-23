package Construcors;

public class InfoAccount {
    private int id;
    private String accountName;

    public int getId(){
        return this.id;
    }
    public String getAccountName(){
        return this.accountName;
    }
    public InfoAccount(){
        this.id = 2;
    }
    public InfoAccount(int id,String accountName){
        this.id = id;
        this.accountName = accountName;
    }
    public void printInfo(int id,String accountName){
        this.id = id;
        this.accountName = accountName;
        System.out.printf("Account ID -> %d%nAccount Name -> %s",id,accountName);
    }

}
