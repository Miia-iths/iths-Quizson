package Quizson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class blandadeFragorMetod {
    public static void startQuiz(){
        ArrayList<Fraga> allaFragor = new ArrayList<>();

        allaFragor.addAll(fragorBlandade.allmanbildningsQuiz());
        allaFragor.addAll(fragorBlandade.sportQuiz());
        allaFragor.addAll(fragorBlandade.vetenskapQuiz());
        allaFragor.addAll(fragorBlandade.seriefilmQuiz());

        Collections.shuffle(allaFragor);

        Scanner scanner = new Scanner(System.in);
        int antalRatt = 0;

        for (int i = 0; i < 10; i++) {
            Fraga f = allaFragor.get(i);
            System.out.println("Fråga " + (i + 1) + ": ");
            f.visaFraga();

            System.out.print("Ditt svar (1-4): ");
            int svar = scanner.nextInt();

            if (svar == f.rattSvarIndex) {
                System.out.println("Rätt svar!");
                antalRatt++;
            } else {
                System.out.println(f.alternativ[f.rattSvarIndex - 1]);
                //ÄNDRA
            }
        }

        System.out.println("Du fick " + antalRatt + " av 10 rätt!");
    }
}
