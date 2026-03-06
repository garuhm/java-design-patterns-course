package abstract_factory;

public class UserEmailNotification implements EmailNotification{
    @Override
    public void send(String msg) {
        System.out.println("user email notif: " + msg);
    }
}
