package GetterAndSetters;

public class DemoGettersAndSetters {
    public static void main(String[] args) {
        MailAccount account = new MailAccount();
        account.setUsername("Stamat");
        account.setUserId(1);
        account.showInfo(account.getUsername(),account.getUserId());
    }
}
