package Entity;


public class Client {

    private String ID;
    private String name;
    private String services;

    
    Client(){

    }

    public void setClient(String ID,String name,String services){
        this.ID = ID;
        this.name=name;
        this.services = services;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    

}
