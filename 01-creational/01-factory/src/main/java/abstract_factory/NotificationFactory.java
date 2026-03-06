package abstract_factory;

public interface NotificationFactory {
    EmailNotification createEmailNotification();
    SMSNotification createSMSNotification();
    WhatsAppNotification createWhatsAppNotification();

}
