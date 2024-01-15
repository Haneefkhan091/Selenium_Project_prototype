package ApacheLogs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log24j {
    private static final Logger log = LogManager.getLogger(log24j.class.getName());

    public static void main(String[] args) {
    	log.debug("This is debug message");
        log.info("This is a log message.");
        if(5>3) {
        	log.info("This is a log message.");
        	log.error("This is the error message");
        	log.fatal("This is the fatal error message");
        	log.debug("This is debug message");
        }
        
        
    }
}
