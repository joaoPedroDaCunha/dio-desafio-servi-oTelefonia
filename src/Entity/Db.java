package Entity;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;



public class Db {

    private Set<Client> listClient;
    
    public Db() {
        this.listClient = new HashSet<>();
    }

    public void register(String ID,String name,String services){
       listClient.add(new Client(ID,name,services));
    }

    public void removeById(String ID){
        if(!listClient.isEmpty()){
            Set<Client> removeClients = new HashSet<>();
            listClient.stream().filter(client -> client.getID().equals(ID)).forEach(client -> removeClients.add(client));
            listClient.removeAll(removeClients);
        }else{
            throw new RuntimeException("Não existe clientes registrados");
        }
    }

    public Set<Client> viewListClientByName(){
        Set<Client> clientByName = new TreeSet<>(listClient);
        return clientByName;
    }

    public void checkServiceVerification(String ID,String service){
        boolean contracted = false;
        for(Client client : listClient){
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

    public void checkCompleteCombo(String ID){
        boolean mobileContractor = false;
        boolean contractedBroadband = false;
        boolean tvContracted = false;
        if(!listClient.isEmpty()){
            for(Client client : listClient){
                if(client.getName().equals(ID)){
                    if(client.getServices().contains("movel")){
                        mobileContractor = true;
                    }
                    if(client.getServices().contains("banda larga")){
                        contractedBroadband = true;
                    }
                    if(client.getServices().contains("tv")){
                        tvContracted = true;
                    }
    
                    if (mobileContractor == true && contractedBroadband == true && tvContracted == true) {
                        System.out.println("Combo Completo");
                    } else {
                        System.out.println("Combo Incompleto");
                    }       
                break;
            }
                if(client.getID().equals(ID)){
                    if(client.getServices().contains("movel")){
                        mobileContractor = true;
                    }
                    if(client.getServices().contains("banda larga")){
                        contractedBroadband = true;
                    }
                    if(client.getServices().contains("tv")){
                        tvContracted = true;
                    }
    
                    if (mobileContractor == true && contractedBroadband == true && tvContracted == true) {
                        System.out.println("Combo Completo");
                    } else {
                        System.out.println("Combo Incompleto");
                    }     
                    break;
                }
                
            }
        }
    }
}
