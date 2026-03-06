package thread_safe;

public class App {
    public static void main(String[] args) {
        DemoLogger instance1  = DemoLogger.getInstance();
        instance1.log("hi!");

        DemoLogger instance2 = DemoLogger.getInstance();
        instance2.log("hello!");
        System.out.println(instance1 == instance2);
    }
}
