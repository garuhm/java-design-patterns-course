package abstract_factory;

public class UserWhatsAppNotification implements WhatsAppNotification{
    @Override
    public void send(String msg) {
        System.out.println("user whatsapp notif: " + msg);
    }
}
