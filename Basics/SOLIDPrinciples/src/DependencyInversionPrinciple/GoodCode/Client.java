package DependencyInversionPrinciple.GoodCode;

public class Client {

    public static void main(String[] args) {
        NotificationService emailService = new NotificationService(new EmailService());
        emailService.sendNotification("Hello via Email!");

        NotificationService smsService = new NotificationService(new SMSService());
        smsService.sendNotification("Hello via SMS!");
    }
}
