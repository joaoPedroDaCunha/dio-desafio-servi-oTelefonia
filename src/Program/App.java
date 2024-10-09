package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entity.Client;
import Entity.Db;

public class App {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        List<Client> db = new ArrayList<>();

        Db.register(db, "0", null, null);

        sc.close();
    }
    
}
