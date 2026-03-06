package bill_pugh;

public class DemoLogger {
    private DemoLogger(){
        System.out.println("logger initialized!");
    }

    private static class Singleton{
        private static final DemoLogger INSTANCE = new DemoLogger();
    }

    public static DemoLogger getInstance(){
        return Singleton.INSTANCE;
    }

    public void log(String msg){
        System.out.println("## LOG: " + msg);
    }
}
