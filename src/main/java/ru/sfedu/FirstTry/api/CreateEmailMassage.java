package ru.sfedu.FirstTry.api;


import java.io.*;
import java.util.List;
import java.util.Optional;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import ru.sfedu.FirstTry.entity.*;

import static ru.sfedu.FirstTry.Constants.*;
import static ru.sfedu.FirstTry.utils.ConfigurationUtil.getConfigurationEntry;


public class CreateEmailMassage {

    public CreateEmailMassage() {
    }

    public <T> List<T> getServer(String cli) throws IOException {
        List<T> result;

        CSVReader csvReader= new CSVReader(new FileReader(getConfigurationEntry(CSV_SERVER_KEY)));
        CsvToBean<T> csvToBean =new CsvToBeanBuilder<T>(csvReader).withType(Server.class).build();

        List<T> collection = csvToBean.parse();
        csvReader.close();


        return collection.stream().filter(o ->o.getName().equals(cli)).findFirst();
    }


}
