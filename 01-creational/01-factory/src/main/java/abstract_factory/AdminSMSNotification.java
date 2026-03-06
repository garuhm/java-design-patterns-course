package abstract_factory;

public class AdminSMSNotification implements SMSNotification{
    @Override
    public void send(String msg) {
        System.out.println("admin sms notif: " + msg);
    }
}
