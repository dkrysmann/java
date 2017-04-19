package Services;


public class CompositeNotificationService implements NotificationService{
   private NotificationService[] notificationServices;
    private boolean isActive;
    public CompositeNotificationService(boolean isActive,NotificationService...notificationServices){
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
