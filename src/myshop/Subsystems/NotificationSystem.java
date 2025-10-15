package myshop.Subsystems;

public class NotificationSystem {
    public void sendEmail(String userEmail, String message) {
        System.out.println("Sending email to " + userEmail + ": " + message);
    }
}
