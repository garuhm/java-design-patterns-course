public class App {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("email");
        notificationService.sendNotification("sms");
        notificationService.sendNotification("whatsapp");
        notificationService.sendNotification("e");
    }
}
