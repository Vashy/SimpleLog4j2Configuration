import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class MyApp {

    private static final Logger logger = LogManager.getLogger(MyApp.class);

    public static void main(String[] args) {

        logger.trace("Entering application");
        Bar bar = new Bar();

        if (!bar.doIt())
            logger.error("Didn't do it.");

        logger.info("Info!");
        logger.debug("debug!");
        logger.trace("Exiting application");
    }
}

