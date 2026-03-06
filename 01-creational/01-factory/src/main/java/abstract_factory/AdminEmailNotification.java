package abstract_factory;

public class AdminEmailNotification implements EmailNotification{
    @Override
    public void send(String msg) {
        System.out.println("admin email notif: " + msg);
    }
}
