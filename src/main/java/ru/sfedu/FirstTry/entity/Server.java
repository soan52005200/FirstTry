package ru.sfedu.FirstTry.entity;

import com.opencsv.bean.CsvBindByPosition;


public class Server {

    @CsvBindByPosition(position = 0)
    private Long id;
    @CsvBindByPosition(position = 1)
    private String name;
    @CsvBindByPosition(position = 2)
    private String ip;
    @CsvBindByPosition(position = 3)
    private int port;
    @CsvBindByPosition(position = 4)
    private String path;


    public Server(Long id, String name,String ip, int port, String path){
        this.id=id;
        this.name=name;
        this.ip=ip;
        this.port=port;
        this.path=path;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
