package DependencyInversionPrinciple.GoodCode;

public class SMSService implements INotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS sent with message: " + message);
    }

}
