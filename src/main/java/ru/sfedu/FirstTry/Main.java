package ru.sfedu.FirstTry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.sfedu.FirstTry.api.CreateEmailMassage;

import java.io.IOException;

import static ru.sfedu.FirstTry.Constants.*;
import static ru.sfedu.FirstTry.utils.ConfigurationUtil.getConfigurationEntry;



public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String args[]) throws IOException {

        try {
            log.debug(System.getProperty(ENV_PROPERTIES));
            log.debug(System.getProperty(LOG4J2_PROPERTIES));
            new CreateEmailMassage(args[0]);


        } catch (Exception exception) {
            log.error(exception);
        }




    }
}