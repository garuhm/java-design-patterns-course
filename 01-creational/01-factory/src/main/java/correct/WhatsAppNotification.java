package correct;

public class WhatsAppNotification implements Notification {

    @Override
    public void send(String msg){
        System.out.println(msg);
    }
}
