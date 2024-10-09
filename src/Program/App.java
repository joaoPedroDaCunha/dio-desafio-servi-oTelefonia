package Program;

import java.util.ArrayList;
import java.util.Scanner;

import Entity.Client;
import Entity.Db;
import Entity.TelephoneServices;

public class App {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        ArrayList<Client> db = new ArrayList<>();
        String ID;
        String name;
        String services;
        Db.Add(db);
        int select = 0;
        
        do {
            System.out.println("Selecione: 1 para cadastar um Cliente");
            System.out.println("selecione: 2 para verifacar se o cliente contratou o serviço");
            System.out.println("Selecione: 3 para verificar se o cliente contratou o combo");
            System.out.println("Selecione: 9 para sair");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Digite o codigo do Cliente : ");
                    ID = sc.next().trim().toLowerCase();
                    sc.nextLine();
                    System.out.print("Digite o nome do cliente : ");
                    name = sc.nextLine().trim().toLowerCase();
                    System.out.print("Digite os servições contradatos pelo cliente, separe os servições por ',' :");
                    services = sc.nextLine().trim().toLowerCase();
                    Db.register(db, ID, name, services);
                    break;
                case 2:
                    System.out.print("Informe o ID ou o nome do cliente : ");
                    sc.nextLine();
                    ID = sc.nextLine();
                    System.out.print("Informe o servoço que desaja verificar : ");
                    services = sc.nextLine();
                    TelephoneServices.checkServiceVerification(db, ID, services);
                    break;
                case 3:
                    System.out.print("Informe o ID ou o nome do cliente : ");
                    sc.nextLine();
                    ID = sc.nextLine() ;
                    TelephoneServices.checkCompleteCombo(db, ID);
                    break;
                default:
                    break;
            }
            
        } while (select != 9);

        sc.close();
    }
    
}
