package ru.sfedu.FirstTry.entity;
import com.opencsv.bean.CsvBindByPosition;


public class Server {

    @CsvBindByPosition(position = 0)
    private Long id;
    @CsvBindByPosition(position = 1)
    private String name;
    @CsvBindByPosition(position = 2)
    private Long ip;
    @CsvBindByPosition(position = 3)
    private String path;

    public Server(Long id,String name,Long ip,String path){
        this.id=id;
        this.name=name;
        this.ip=ip;
        this.path=path;

    }
    
    public String getName(){
        return this.name;
    }


}
