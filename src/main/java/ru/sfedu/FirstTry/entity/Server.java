package ru.sfedu.FirstTry.entity;



public class Server {
    private Long id;
    private String name;
    private Long ip;
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
