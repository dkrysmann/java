
public class Main {
    public static void main(String[] args) {
        CreateAccount account = new CreateAccount("Pepo",28,"M",1);
        System.out.println(account.printInformation());
        account.changeId(2);
        System.out.println(account.printInformation());
    }
}
