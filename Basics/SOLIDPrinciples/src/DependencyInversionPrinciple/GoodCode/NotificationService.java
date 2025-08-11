package DependencyInversionPrinciple.GoodCode;

public class NotificationService {

    private INotificationChannel notificationChannel;

    public NotificationService(INotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void sendNotification(String message) {
        notificationChannel.sendNotification(message);
    }

}
