package abstract_factory;

public class AdminNotificationFactory implements NotificationFactory{

    @Override
    public EmailNotification createEmailNotification() {
        return new AdminEmailNotification();
    }

    @Override
    public SMSNotification createSMSNotification() {
        return new AdminSMSNotification();
    }

    @Override
    public WhatsAppNotification createWhatsAppNotification() {
        return new AdminWhatsAppNotification();
    }
}
