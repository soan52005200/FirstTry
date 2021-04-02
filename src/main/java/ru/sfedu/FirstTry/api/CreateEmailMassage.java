package ru.sfedu.FirstTry.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.sfedu.FirstTry.entity.Server;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static ru.sfedu.FirstTry.Constants.CSV_SERVER_KEY;
import static ru.sfedu.FirstTry.utils.ConfigurationUtil.getConfigurationEntry;

public class CreateEmailMassage {
    private static final Logger log = LogManager.getLogger(CreateEmailMassage.class);

    public CreateEmailMassage(String name) throws IOException {
        Server server = getServerByName(name);



    }


    public Server getServerByName(String name) throws RuntimeException, IOException {

        String line ="";

        String[] found = new String[4];



        try {
            BufferedReader br = new BufferedReader(new FileReader(getConfigurationEntry(CSV_SERVER_KEY)));
            while ((line = br.readLine()) != null) {

                String[] column = line.split(",");

                if (column[1].equals(name)){
                  found[0]=column[0];
                  found[1]=column[1];
                  found[2]=column[2];
                  found[3]=column[3];
                }
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
        e.printStackTrace();
    }

        return new Server(Long.parseLong(found[0]),found[1],found[2],found[3]);
    }}