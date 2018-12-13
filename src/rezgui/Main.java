package rezgui;

import java.io.FilenameFilter;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.toString());

    public static void main(String[] args) {
        LOGGER.info("hello i'm here don't panic");
        Runnable runnable = () -> LOGGER.warning("this is running now pay attention");
        new Thread(runnable).start();
        FilenameFilter filenameFilter;
    }
}
