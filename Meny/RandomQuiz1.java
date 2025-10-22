package Meny;

import java.util.ArrayList;
import java.util.Collections;

public class RandomQuiz1 {
    public static void startQuiz(){
        ArrayList<Fråga> allaFrågor = new ArrayList<>();

        allaFrågor.addAll(Questions2.allmänbildningsQuiz());
        allaFrågor.addAll(Questions2.sportQuiz());
        allaFrågor.addAll(Questions2.vetenskapQuiz());
        allaFrågor.addAll(Questions2.seriefilmQuiz());

        Collections.shuffle(allaFrågor);

        System.out.println("Random quiz: ");
        int antal = 0;
        for (Fråga f : allaFrågor){
            f.visaFråga();
            System.out.println();
            antal++;
            if(antal == 10) break;
        }
    }

}
