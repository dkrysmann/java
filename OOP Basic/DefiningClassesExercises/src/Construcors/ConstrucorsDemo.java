package Construcors;

public class ConstrucorsDemo {
    public static void main(String[] args) {
        InfoAccount account = new InfoAccount(12,"Pesho");
        InfoAccount account1 = new InfoAccount(1,"Stamat");
       account.printInfo(account.getId(),account.getAccountName());
        System.out.println();
       account1.printInfo(account1.getId(),account1.getAccountName());
    }
}
