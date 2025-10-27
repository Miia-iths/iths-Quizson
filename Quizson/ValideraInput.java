package Quizson;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ValideraInput {

    public static int läsHeltalIInterval(Scanner scanner, int min, int max, String uppmaning) {
        int värde = -1;
        boolean giltigt = false;

        while (!giltigt) {
            System.out.print(uppmaning);
            try {
                värde = scanner.nextInt();
                if (värde >= min && värde <= max) {
                    giltigt = true;
                } else {
                    System.out.println("⚠️ Ogiltigt val! Ange en siffra mellan " + min + " och " + max + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Felaktig inmatning! Skriv endast siffror.");
                scanner.nextLine();
            }
        }

        return värde;
    }
}

