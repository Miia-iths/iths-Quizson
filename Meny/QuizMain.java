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
            System.out.println();
                RandomQuiz1.startQuiz();
        } else {
            Scanner scanner = new Scanner (System.in);

            System.out.println("Du valde specefika kategorier");
            System.out.println("**********************************");
            System.out.println("Välj mellan de fyra olika teman: ");
            System.out.println("1. Allmänbildning");
            System.out.println("2. Film & serier");
            System.out.println("3. Vetenskap");
            System.out.println("4. Sport");
            System.out.print("Skriv in 1-4: ");
        

            int valet = scanner.nextInt();

            switch (valet) {
                case 1:
                Questions.allmänbildningsQuiz();
                break;
            case 2:
                Questions.seriefilmQuiz();
                break;
            case 3:
                Questions.vetenskapQuiz();
                break;
            case 4:
                Questions.sportQuiz();
                break;
            default:
                System.out.println("Ogiltigt val! Välj en siffra mellan 1 och 4.");

                scanner.close();
            }
        }
    }
}
