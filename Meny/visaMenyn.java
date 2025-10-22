package Meny;
import java.util.Scanner;

public class visaMenyn {
    
    public static int visaMenyn1(){
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Dags att välja ett av alternativen: ");
        System.out.println("1. Blandade kategorier");
        System.out.println("2. Specefika kategorier");
        System.out.print("Skriv in 1-2: ");

        int val = scan.nextInt();

        while(val != 1 && val != 2){
            System.out.print("Ogiltigt val! Välj igen: ");
            val = scan.nextInt();
        }
        return val;
    }
}
