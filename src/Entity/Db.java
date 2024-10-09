package Entity;

import java.util.ArrayList;


public class Db {

    static Client db = new Client();
    
    public static void Add(ArrayList<Client> Db){
        db.setClient("1", "jorge", "movel,banda larga");
        Db.add(db);
        db.setClient("2", "maria", "banda larga,tv");
        Db.add(db);
        db.setClient("3", "mateus", "tv");
        Db.add(db);
        db.setClient("4", "felipe", "banda larga,movel");
        Db.add(db);
        db.setClient("5", "marcio", "banda larga,tv");
        Db.add(db);
        db.setClient("6", "maria", "banda larga,tv,movel");
        Db.add(db);
        db.setClient("7", "ana", "movel,banda larga");
        Db.add(db);
        db.setClient("8", "beatriz", "tv,banda larga");
        Db.add(db);
        db.setClient("9", "mariana", "tv,banda larga,movel");
        Db.add(db);
        db.setClient("10", "giovana", "banda larga");
        Db.add(db);
    }

    public static void register(ArrayList<Client> Db,String ID,String name,String service){
        db.setClient(ID, name, service);
        Db.add(db);
    }

}
