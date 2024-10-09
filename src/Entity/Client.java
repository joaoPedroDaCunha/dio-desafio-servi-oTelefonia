package Entity;


public class Client {

    private int ID;
    private String name;
    private String services;

    
    Client(){

    }

    public void setClient(int ID,String name,String services){
        this.ID = ID;
        this.name=name;
        this.services = services;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
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
