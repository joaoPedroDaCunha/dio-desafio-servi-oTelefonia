package Entity;

import java.util.ArrayList;
import java.util.List;


public class Db {

    List<Client> Db;
    
    public Db() {
        this.Db = new ArrayList<>();
    }

    public void Add(){
       Db.add(new Client("1","jorge","movel,tv"));
    }

    public void register(String ID,String name,String services){
       Db.add(new Client(ID,name,services));
    }

}
