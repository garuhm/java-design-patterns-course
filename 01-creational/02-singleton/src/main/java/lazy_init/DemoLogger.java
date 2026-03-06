package lazy_init;

import java.util.logging.Logger;

public class DemoLogger {
    private static DemoLogger instance;

    private DemoLogger(){
        System.out.println("logger initialized!");
    }

    public static DemoLogger getInstance(){
        if(instance == null){
            instance = new DemoLogger();
        }

        return instance;
    }

    public void log(String msg){
        System.out.println("## LOG: " + msg);
    }
}
