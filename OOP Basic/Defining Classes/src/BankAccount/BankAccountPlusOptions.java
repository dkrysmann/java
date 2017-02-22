package BankAccount;


public class BankAccountPlusOptions {
    public static void main(String[] args) {
        BankAccountOpt bankAccountOpt = new BankAccountOpt();
        bankAccountOpt.setId(1);
        bankAccountOpt.deposit(20);
        try {
            bankAccountOpt.withdraw(10);
        }catch (IllegalStateException illegl){
            System.out.println(illegl.getMessage());
        }
        System.out.printf("Account %s,%nBalance %.2f",bankAccountOpt,bankAccountOpt.getBalance());
    }
}
