package ru.sfedu.FirstTry.api;

import ru.sfedu.FirstTry.entity.Server;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ServerConnect {
    public ServerConnect(Server server) throws IOException {
        try {
            var s = new Socket(server.getIp(), server.getPort());

            Scanner in = new Scanner(s.getInputStream(),"UTF_8");
            while (in.hasNextLine())
            {
                String line = in.nextLine();
                System.out.println(line);
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


    }
}
