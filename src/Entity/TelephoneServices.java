package Entity;

import java.util.List;

public class TelephoneServices {

    public static void checkServiceVerification(List<Client> db,String ID,String service){
        boolean contracted = false;
        for(Client client : db){
           if(client.getID().equals(ID)){
            if(service.equals(client.getServices())){
                contracted = true;
                System.out.println("Sim");
              }
           }
           if(client.getName().equals(ID)){
            if(service.equals(client.getServices())){
                contracted = true;
                System.out.println("Sim");
              }
           }
          }
          if(contracted == false){
            System.out.println("Nao");
          }

    }
    
    public static void checkCompleteCombo(List<Client>db,String ID){

        String [] servicesContracted =new String [5];
        boolean mobileContractor = false;
        boolean contractedBroadband = false;
        boolean tvContracted = false;
        for(Client client : db){
            if(client.getName().equals(ID)){
                servicesContracted = client.getServices().split(",");
                for (int i=0;i<servicesContracted.length;i++) {
                    if(servicesContracted[i].equals("movel")){
                        mobileContractor = true;
                    }
                    if(servicesContracted[i].equals("banda larga")){
                        contractedBroadband = true;
                    }
                    if(servicesContracted[i].equals("tv")){
                        tvContracted = true;
                    }
            }        
            
        }
            if(client.getID().equals(ID)){
                servicesContracted = client.getServices().split(",");
                for (int i=0;i<servicesContracted.length;i++) {
                    if(servicesContracted[i].equals("movel")){
                        mobileContractor = true;
                    }
                    if(servicesContracted[i].equals("banda larga")){
                        contractedBroadband = true;
                    }
                    if(servicesContracted[i].equals("tv")){
                        tvContracted = true;
                    }
                }   

            }
            
        }
    }
}
