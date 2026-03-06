package abstract_factory;

public class AdminWhatsAppNotification implements WhatsAppNotification{
    @Override
    public void send(String msg) {
        System.out.println("admin whatsapp notif: " + msg);
    }
}
