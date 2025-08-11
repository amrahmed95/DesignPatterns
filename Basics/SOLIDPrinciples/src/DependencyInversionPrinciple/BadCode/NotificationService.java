package DependencyInversionPrinciple.BadCode;

// High-level module (that depends on low-level modules like EmailService and SMSService directly
// with their concrete implementations -- without abstraction)
public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationService() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void sendEmail(String message) {
        emailService.sendEmail(message);
    }

    public void sendSMS(String message) {
        smsService.sendSMS(message);
    }
}

/*
 * This code violates the Dependency Inversion Principle because the high-level module
 * (NotificationService) is directly dependent on low-level modules (EmailService and SMSService).
 * This creates tight coupling and makes it difficult to change or extend the notification methods
 * without modifying the high-level module.
 */