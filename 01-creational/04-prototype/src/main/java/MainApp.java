public class MainApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        EmailTemplate emailTemplate = new EmailTemplate("hello", "hello world!", "- gabe");
        EmailTemplate email1 = (EmailTemplate) emailTemplate.clone();
        email1.sendEmail("group");
        EmailTemplate email2 = (EmailTemplate) emailTemplate.clone();
        email2.setBody("sup bro");
        email2.sendEmail("bro");
    }
}
