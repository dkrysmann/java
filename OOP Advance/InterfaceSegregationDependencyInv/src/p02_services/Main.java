package p02_services;

public class Main {
    public static void main(String[] args) {
        CompositNotificationService service = new CompositNotificationService
                (true,new EmailNotificationService(true));
        OnlineStoreOrder storeOrder = new OnlineStoreOrder(service);
    }
}
