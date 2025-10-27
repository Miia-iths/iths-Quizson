package Meny;

import java.util.Scanner;

public class visaMenyn {

    public static int visaMenyn1(Scanner scanner) {
        System.out.println();
        System.out.println("Dags att välja ett av alternativen: ");
        System.out.println("1. Blandade kategorier");
        System.out.println("2. Specifika kategorier");

        return ValideraInput.läsHeltalIInterval(scanner, 1, 2, "Skriv in ditt val (1 eller 2): ");
    }
}
