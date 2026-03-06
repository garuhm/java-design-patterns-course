package abstract_factory;

public class UserSMSNotification implements SMSNotification{
    @Override
    public void send(String msg) {
        System.out.println("user sms notif: " + msg);
    }
}
