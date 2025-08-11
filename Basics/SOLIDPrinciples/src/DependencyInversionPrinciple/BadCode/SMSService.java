package DependencyInversionPrinciple.BadCode;

// Low-level module
public class SMSService {
    public void sendSMS(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}
