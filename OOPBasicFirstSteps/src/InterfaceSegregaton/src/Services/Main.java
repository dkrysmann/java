package Services;


public class Main {
    public static void main(String[] args) {
        CompositeNotificationService service = new CompositeNotificationService(true,new EmailNotification());
        OnlineStoreOrder order = new OnlineStoreOrder(service);
    }
}
