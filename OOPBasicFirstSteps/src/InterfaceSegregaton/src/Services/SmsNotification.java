package Services;

public class SmsNotification implements NotificationService{
    private boolean isActive;
    @Override
    public void sendNotification() {

    }

    @Override
    public boolean isActive() {
        return this.isActive;
    }
}
