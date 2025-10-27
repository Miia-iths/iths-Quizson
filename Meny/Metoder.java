package Meny;
import java.util.Scanner;

public class Metoder{

    public static void frågorOchSvar(String [] frågor, String [][] svarsAlternativ, int []rättSvar){
        Scanner scanner = new Scanner(System.in);
        int antalRätt = 0;
        long startTidFraga;
        long totalTidFragaMillis = 0;
        long svarsTid = 0;
        long startTid = System.currentTimeMillis();
        for (int i = 0; i < frågor.length; i++) {
        
        startTidFraga = System.currentTimeMillis();
        System.out.println("Fråga " + (i + 1) + ": " + frågor[i]);

        for (String alt : svarsAlternativ[i]) {
            System.out.println(alt);
        }

        System.out.print("Skriv in ditt svar (1-4): ");
        int svar = scanner.nextInt();

        long slutTidFraga = System.currentTimeMillis();
        svarsTid = slutTidFraga - startTidFraga;

        if (svarsTid > 60000) {
            System.out.println("Du tog för lång tid! max svarstid är 60 sekunder.");
        } else if (svar == rättSvar[i]) {
            System.out.println("Rätt svar!");
            System.out.println();
            antalRätt++;
            totalTidFragaMillis += svarsTid;
        } else {
            System.out.println("Fel svar! Rätt svar var: " + svarsAlternativ[i][rättSvar[i] - 1]);
            System.out.println();
        }
    }
    
    long slutTid = System.currentTimeMillis();

    System.out.println("Du fick " + antalRätt + " av " + frågor.length + " rätt!");

    long totalTidMillis = slutTid - startTid;
    int totalTidSekunder = (int) (totalTidMillis / 1000);
    int totalTidMinuter = totalTidSekunder / 60;
    int totalTidSekunderKvar = totalTidSekunder % 60;
    System.out.println("Din totala tid blev " + totalTidMinuter + " min och " + totalTidSekunderKvar + " sekunder.");

    int totalTidFragaSekunder = (int) (totalTidFragaMillis / 1000);
    int maxTidPerFråga = 60;
    int totalMaxSekunder = antalRätt * maxTidPerFråga;
    int totalPoäng = totalMaxSekunder - totalTidFragaSekunder;
    System.out.println("Du svarade de " + antalRätt + " frågorna på sammanlagt " + totalTidFragaSekunder + " sekunder vilket leder till " + totalPoäng + " poäng!");

    }
}
