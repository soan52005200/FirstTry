package ru.sfedu.FirstTry.api;

import ru.sfedu.FirstTry.entity.Server;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

import static ru.sfedu.FirstTry.Constants.MESSAGE_KEY;
import static ru.sfedu.FirstTry.utils.ConfigurationUtil.getConfigurationEntry;
//Производит подключение к серверу по данным из server.csv
public class ServerConnect {
    public ServerConnect(Server server) throws IOException {
        try {

            var s = new Socket(server.getIp(), server.getPort());
            Scanner in = new Scanner(s.getInputStream(),"UTF-8");
            while (in.hasNextLine())
            {
                String line = in.nextLine();
                try(FileWriter writer = new FileWriter(getConfigurationEntry(MESSAGE_KEY),true)) {
                    writer.write(line);
                    writer.append('\n');
                    writer.flush();
                }
                catch(IOException ex){
                    System.out.println(ex.getMessage());
                }

            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


    }
}
