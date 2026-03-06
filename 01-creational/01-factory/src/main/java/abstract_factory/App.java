package abstract_factory;

public class App {
    public static void main(String[] args) {
        NotificationFactory notificationFactory;
        EmailNotification emailNotification;
        SMSNotification smsNotification;
        WhatsAppNotification whatsAppNotification;

//        user
        notificationFactory = new UserNotificationFactory();
        emailNotification = notificationFactory.createEmailNotification();
        smsNotification = notificationFactory.createSMSNotification();
        whatsAppNotification = notificationFactory.createWhatsAppNotification();

        emailNotification.send("hello");
        smsNotification.send("hello");
        whatsAppNotification.send("hello");
    }
}
