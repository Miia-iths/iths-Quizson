package Meny;
import java.util.Scanner;

import Javier.RandomQuiz;

public class QuizMain {
    public static void main(String[] args) {
        System.out.println("Välkommna till Quizsons frågesport!!!");
        System.out.println("Spelreglerna är enkla: ");
        System.out.println("Du väljer om du vill ha blandade eller specefika kategorier på frågorna");
        System.out.println("Frågorna är från början värda ett visst antal poäng, men de minskar i värde ju längre tiden går");
        System.out.println("När tiden tar slut byter spelet automatiskt till nästa fråga");

        int val = visaMenyn.visaMenyn1();

        if (val == 1){
            System.out.println("Du valde blandade kategorier");
                RandomQuiz.startQuiz();
        } else {
            System.out.println("Du valde specefika kategorier");
                //Välja kategori här
        }
    }
}
