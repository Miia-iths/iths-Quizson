package Meny;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RandomQuiz1 {
    public static void startQuiz(){
        ArrayList<Fråga> allaFrågor = new ArrayList<>();

        allaFrågor.addAll(Questions2.allmänbildningsQuiz());
        allaFrågor.addAll(Questions2.sportQuiz());
        allaFrågor.addAll(Questions2.vetenskapQuiz());
        allaFrågor.addAll(Questions2.seriefilmQuiz());

        Collections.shuffle(allaFrågor);

        Scanner scan = new Scanner(System.in);
        int antalRätt = 0;

        for (int i = 0; i < 10; i++) {
            Fråga f = allaFrågor.get(i);
            System.out.println("Fråga " + (i + 1) + ": ");
            f.visaFråga();

            System.out.print("Ditt svar (1-4): ");
            int svar = scan.nextInt();

            if (svar == f.rättSvarIndex) {
                System.out.println("Rätt svar!");
                antalRätt++;
            } else {
                System.out.println(f.alternativ[f.rättSvarIndex - 1]);
                //ÄNDRA
            }
        }

        System.out.println("Du fick " + antalRätt + " av 10 rätt!");
    }
}
