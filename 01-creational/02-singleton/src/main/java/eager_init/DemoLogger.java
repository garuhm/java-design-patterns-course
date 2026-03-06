package eager_init;

public class DemoLogger {
    private static final DemoLogger instance = new DemoLogger();

    private DemoLogger(){
        System.out.println("logger initialized!");
    }

    public static DemoLogger getInstance(){
        return instance;
    }

    public void log(String msg){
        System.out.println("## LOG: " + msg);
    }
}
