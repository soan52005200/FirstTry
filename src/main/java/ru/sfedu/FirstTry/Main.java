package ru.sfedu.FirstTry;
import com.opencsv.*;
import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.sfedu.FirstTry.api.*;
import ru.sfedu.FirstTry.Constants.*;


import static ru.sfedu.FirstTry.Constants.*;
import static ru.sfedu.FirstTry.utils.ConfigurationUtil.*;



public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String args[]) throws IOException {


        try {
            log.debug(System.getProperty(ENV_PROPERTIES));
            log.debug(System.getProperty(LOG4J2_PROPERTIES));
            log.info(new CreateEmailMassage().getServer(args[0]));

        } catch (Exception exception) {
            log.error(exception);
        }




    }
}