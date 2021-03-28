package ru.sfedu.FirstTry.api;


import java.io.*;
import java.util.List;
import java.util.Optional;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import ru.sfedu.FirstTry.entity.*;

import static ru.sfedu.FirstTry.Constants.*;
import static ru.sfedu.FirstTry.utils.ConfigurationUtil.getConfigurationEntry;


public class CreateEmailMassage {

    public CreateEmailMassage() {
    }

    public Optional<Server> GetServer(String cli) throws IOException {

        CSVReader csvReader= new CSVReader(new FileReader(getConfigurationEntry(CSV_SERVER_KEY)));
        CsvToBean csvToBean =new CsvToBean();
        List<Server> collection = csvToBean.parse();
        csvReader.close();


        return collection.stream().filter(o ->o.getName().equals(cli)).findFirst();
    }


}
