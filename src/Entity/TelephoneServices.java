package Entity;



public class TelephoneServices {

    public static void checkServiceVerification(Db db,String ID,String service){
        boolean contracted = false;
        for(Client client : db.Db){
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
    
    public static void checkCompleteCombo(Db db,String ID){

        String [] servicesContracted =new String [5];
        boolean mobileContractor = false;
        boolean contractedBroadband = false;
        boolean tvContracted = false;
        for(Client client : db.Db){
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
            if (mobileContractor == true && contractedBroadband == true && tvContracted == true) {
                System.out.println("Combo Completo");
            } else {
                System.out.println("Combo Incompleto");
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
                if (mobileContractor == true && contractedBroadband == true && tvContracted == true) {
                    System.out.println("Combo Completo");
                } else {
                    System.out.println("Combo Incompleto");
                }

            }
            
        }
    }
}
