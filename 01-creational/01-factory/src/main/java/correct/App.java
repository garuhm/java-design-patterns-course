package correct;

public class App {
    public static void main(String[] args) {
        Notification smsNotification = NotificationFactory.createNotification("sms");
        smsNotification.send("hello! -sms");
    }
}
