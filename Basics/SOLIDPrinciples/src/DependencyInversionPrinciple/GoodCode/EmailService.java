package DependencyInversionPrinciple.GoodCode;

public class EmailService implements INotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email sent with message: " + message);

    }
}