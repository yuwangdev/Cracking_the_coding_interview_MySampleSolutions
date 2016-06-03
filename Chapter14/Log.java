package Chapter14;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Created by yuwang on 2016-05-24.
 */
public class Log {

    private static final Logger logger = Logger.getLogger(Log.class.getName());

    public void dosth() throws IOException {
        FileHandler fileHandler = new FileHandler("test.txt");
        logger.addHandler(fileHandler);


        logger.setLevel(Level.ALL);


        logger.entering(getClass().getName(), "do");

        logger.log(Level.INFO, "hello");


    }


    public static void main(String[] argus) {

        Log log = new Log();
        try {
            log.dosth();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
