package Program;


import java.util.Scanner;


import Entity.Db;

public class App {
    public static void main(String[] args) throws RuntimeException {
        Scanner sc =new Scanner(System.in);

        Db db = new Db();
        String ID;
        String name;
        String services;
        int select = 0;
        
        do {
            System.out.println("Selecione: 1 para cadastar um Cliente");
            System.out.println("selecione: 2 para verifacar se o cliente contratou o serviço");
            System.out.println("Selecione: 3 para verificar se o cliente contratou o combo");
            System.out.println("Selecione: 4 para mostar os clientes registrados");
            System.out.println("Selecione: 5 para remover um cliente");
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
                    db.register(ID, name, services);
                    break;
                case 2:
                    System.out.print("Informe o ID ou o nome do cliente : ");
                    sc.nextLine();
                    ID = sc.nextLine();
                    System.out.print("Informe o serviço que desaja verificar : ");
                    services = sc.nextLine();
                    db.checkServiceVerification(ID, services);
                    break;
                case 3:
                    System.out.print("Informe o ID ou o nome do cliente : ");
                    sc.nextLine();
                    ID = sc.nextLine() ;
                    db.checkCompleteCombo(ID);
                    break;
                case 4:
                    System.out.println(db.viewListClientByName());
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Digite o ID do cliente que dejesa apagar :");
                    ID = sc.nextLine().trim().toLowerCase();
                    db.removeById(ID);
                default:
                    break;
            }
            
        } while (select != 9);

        sc.close();
    }
    
}