package abstract_factory;

public class UserNotificationFactory implements NotificationFactory{
    @Override
    public EmailNotification createEmailNotification() {
        return new UserEmailNotification();
    }

    @Override
    public SMSNotification createSMSNotification() {
        return new UserSMSNotification();
    }

    @Override
    public WhatsAppNotification createWhatsAppNotification() {
        return new UserWhatsAppNotification();
    }
}
