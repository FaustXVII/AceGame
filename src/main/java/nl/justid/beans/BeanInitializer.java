package nl.justid.beans;

public class BeanInitializer {
    private static boolean hasRun = false;

    private BeanInitializer(){}

    public static void init(){
        if(hasRun) {
            return;
        }

        hasRun = true;
        new DisplayBean();
    }
}
