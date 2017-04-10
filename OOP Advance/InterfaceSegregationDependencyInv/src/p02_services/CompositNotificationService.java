package p02_services;


public class CompositNotificationService implements NotificationService{
    private boolean isActive;
    NotificationService[] notificationServices;
    public CompositNotificationService(boolean isActive,NotificationService...notificationServices){
        this.notificationServices = notificationServices;
        this.isActive = isActive;
    }
    @Override
    public void sendNotification() {

    }

    @Override
    public boolean isActive() {
        return this.isActive;
    }
}
