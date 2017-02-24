package StaticMembers;


public class StaticMembersDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1,"Pesho");
        System.out.printf("Account with ID %d and Name %s Created:%n",account.getId(),account.getNameOfAccount());
    }
}
