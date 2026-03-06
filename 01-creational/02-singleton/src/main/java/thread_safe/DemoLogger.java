package thread_safe;

public class DemoLogger {
    private static DemoLogger instance;

    private DemoLogger(){
        System.out.println("logger initialized!");
    }

    public synchronized static DemoLogger getInstance(){
        if(instance == null){
            instance = new DemoLogger();
        }
        return instance;
    }

    public void log(String msg){
        System.out.println("## LOG: " + msg);
    }
}
