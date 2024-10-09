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
        Db.Add(db);
        int select = 0;
        
        do {
            System.out.println("Selecione: 1 para cadastar um Cliente");
            System.out.println("Selecione: 9 para sair");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Digite o codigo do Cliente : ");
                    String ID = sc.next().trim().toLowerCase();
                    sc.nextLine();
                    System.out.print("Digite o nome do cliente : ");
                    String name = sc.nextLine().trim().toLowerCase();
                    System.out.print("Digite os servições contradatos pelo cliente, separe os servições por ',' :");
                    String services = sc.nextLine().trim().toLowerCase();
                    Db.register(db, ID, name, services);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    break;
            }
            
        } while (select != 9);

        sc.close();
    }
    
}
