package ru.sfedu.FirstTry.api;

import com.opencsv.bean.CsvToBeanBuilder;
import ru.sfedu.FirstTry.entity.Server;

import java.io.FileReader;
import java.io.IOException;

import static ru.sfedu.FirstTry.Constants.CSV_SERVER_KEY;
import static ru.sfedu.FirstTry.utils.ConfigurationUtil.getConfigurationEntry;

public class CreateEmailMassage {

    public CreateEmailMassage() {
    }

    public Server getServerByName(String name) throws RuntimeException,IOException {
        /**List<Server> servers = new CsvToBeanBuilder(new FileReader(getConfigurationEntry(CSV_SERVER_KEY))).withType(Server.class).build().parse();*/
        FileReader fileReader=new FileReader(getConfigurationEntry(CSV_SERVER_KEY));
        System.out.println(fileReader);
        CsvToBeanBuilder csvToBeanBuilder = new CsvToBeanBuilder(fileReader);
        System.out.println(csvToBeanBuilder);
        csvToBeanBuilder.withType(Server.class);
        System.out.println(csvToBeanBuilder);
        csvToBeanBuilder.build();
        System.out.println(csvToBeanBuilder);


        return null;
    }


}
