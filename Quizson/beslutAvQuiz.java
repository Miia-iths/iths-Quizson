package Quizson;

import java.util.Scanner;

public class beslutAvQuiz {
    
    public static int beslut(){
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Dags att välja ett av alternativen: ");
        System.out.println("1. Blandade kategorier");
        System.out.println("2. Specefika kategorier");

        int val = scanner.nextInt();

        while(val != 1 && val != 2){
            System.out.println("Ogiltigt val! Välj igen");
            val = scanner.nextInt();
        }
        return val;
    }
}
