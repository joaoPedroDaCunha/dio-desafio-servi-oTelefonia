package Referenc;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String test =sc.nextLine().trim().toLowerCase().replace(" ","");
        System.out.println(test);
        sc.close();
    }
}
