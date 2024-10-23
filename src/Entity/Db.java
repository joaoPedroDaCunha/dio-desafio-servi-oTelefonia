package Entity;

import java.util.ArrayList;
import java.util.List;


public class Db {

    private List<Client> ListClient;
    
    public Db() {
        this.ListClient = new ArrayList<>();
    }

    public void register(String ID,String name,String services){
       ListClient.add(new Client(ID,name,services));
    }

    public void removeById(String ID){
        if(!ListClient.isEmpty()){
            for(Client c : ListClient){
                if(c.getID().equalsIgnoreCase(ID)){
                    ListClient.remove(c);
                    break;
                }
            }
        }
    }

    public void checkServiceVerification(String ID,String service){
        boolean contracted = false;
        for(Client client : ListClient){
           if(client.getID().equals(ID)){
            if(client.getServices().contains(service)){
                contracted = true;
                System.out.println("Sim");
              }
           }
           if(client.getName().equals(ID)){
            if(client.getServices().contains(service)){
                contracted = true;
                System.out.println("Sim");
              }
           }
          }
          if(contracted == false){
            System.out.println("Nao");
          }

    }

}
