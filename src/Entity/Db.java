package Entity;

import java.util.List;

public class Db {

    static Client db = new Client();
    
    public static void Add(List<Client> Db){
        db.setClient(1, "jorge", "movel");
        Db.add(db);
    }

    public static void register(List<Client> Db,int ID,String name,String service){
        db.setClient(ID, name, service);
        Db.add(db);
    }

}
