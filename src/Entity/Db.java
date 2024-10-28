package Entity;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;



public class Db {

    private Set<Client> listClient;
    @SuppressWarnings("unused")
    private boolean contracted;

    
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
        contracted = false;
        if(!listClient.isEmpty()){
            listClient.stream().filter(client -> client.getID().equals(ID)||client.getName().contains(ID)).forEach(client -> {
                if(client.getServices().contains(service)){
                    contracted = true;
                    System.out.println("serviço contratado");
                }else{
                    contracted = false;
                    System.out.println("serviço não cotratado");
                }
            });
        }else {
            throw new RuntimeException("Não existe registros na lista");
        }        

    }

    public void checkCompleteCombo(String ID){
        if(!listClient.isEmpty()){
            listClient.stream().filter(client -> client.getID().equalsIgnoreCase(ID)||client.getName().equalsIgnoreCase(ID))
            .forEach(client ->{if(client.getServices().contains("tv")&&client.getServices().contains("movel")&&client.getServices().contains("banda larga")){
                System.out.println("Combo completo");
            }else{
                System.out.println("combo imcompleto");
            }});
        }else{
            throw new RuntimeException("Não existe registros na lista");
        }
    }
}
