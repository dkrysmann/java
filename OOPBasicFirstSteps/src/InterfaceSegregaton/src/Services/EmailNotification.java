package Services;

public class EmailNotification implements NotificationService{
    private boolean isActive;
    @Override
    public void sendNotification() {

    }

    @Override
    public boolean isActive() {
        return this.isActive;
    }
}
