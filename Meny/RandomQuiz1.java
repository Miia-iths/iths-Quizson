package Meny;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RandomQuiz1 {

    public static void startQuiz(Scanner scanner) {
        ArrayList<Fråga> allaFrågor = new ArrayList<>();
        allaFrågor.addAll(Questions2.allmänbildningsQuiz());
        allaFrågor.addAll(Questions2.sportQuiz());
        allaFrågor.addAll(Questions2.vetenskapQuiz());
        allaFrågor.addAll(Questions2.seriefilmQuiz());

        Collections.shuffle(allaFrågor);

        int antalRätt = 0;
        long startTidFraga = 0;
        long totalTidFragaMillis = 0;
        long svarsTid = 0;
        long startTid = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            startTidFraga = System.currentTimeMillis();
            Fråga f = allaFrågor.get(i);
            System.out.println("\nFråga " + (i + 1) + ": ");
            f.visaFråga();

            int svar = ValideraInput.läsHeltalIInterval(scanner, 1, 4, "Ditt svar (1-4): ");

            long slutTidFraga = System.currentTimeMillis();
            svarsTid = slutTidFraga - startTidFraga;

            if (svarsTid > 60000) {
                System.out.println("Du tog för lång tid! max svarstid är 60 sekunder.");
            } else if (svar == f.rättSvarIndex) {
                System.out.println("✅ Rätt svar!");
                antalRätt++;
                totalTidFragaMillis += svarsTid;
            } else {
                System.out.println("❌ Fel! Rätt svar var: " + f.alternativ[f.rättSvarIndex - 1]);
            }
        }
        
        long slutTid = System.currentTimeMillis();S

        System.out.println("Du fick " + antalRätt + " av 10 rätt!");
        TidOchPoang.tidPoang(slutTid, startTid, startTidFraga, totalTidFragaMillis, antalRatt);

        System.out.println("\n🎯 Du fick " + antalRätt + " av 10 rätt!");
    }
}
