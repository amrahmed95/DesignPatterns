package DependencyInversionPrinciple.BadCode;

// Low-level module
public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email with message: " + message);
    }

}
