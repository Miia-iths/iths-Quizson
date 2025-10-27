package Quizson;
import java.util.Scanner;

public class quizMetoder{

    public static void fragorOchSvar(String [] fragor, String [][] svarsAlternativ, int []rattSvar){
        Scanner scanner = new Scanner(System.in);
        int antalRatt = 0;
        long startTidFraga;
        long totalTidFragaMillis = 0;
        long svarsTid = 0;
        long startTid = System.currentTimeMillis();
        for (int i = 0; i < fragor.length; i++) {
        
        startTidFraga = System.currentTimeMillis();
        System.out.println("Fråga " + (i + 1) + ": " + fragor[i]);

        for (String alt : svarsAlternativ[i]) {
            System.out.println(alt);
        }

        System.out.print("Skriv in ditt svar (1-4): ");
        int svar = scanner.nextInt();

        long slutTidFraga = System.currentTimeMillis();
        svarsTid = slutTidFraga - startTidFraga;

        if (svarsTid > 60000) {
            System.out.println("Du tog för lång tid! max svarstid är 60 sekunder.");
        } else if (svar == rattSvar[i]) {
            System.out.println("Rätt svar!");
            antalRatt++;
            totalTidFragaMillis += svarsTid;
        } else {
            System.out.println("Fel svar! Rätt svar var: " + svarsAlternativ[i][rattSvar[i] - 1]);
        }
    }
    
    long slutTid = System.currentTimeMillis();

    System.out.println("Du fick " + antalRatt + " av " + fragor.length + " rätt!");

    long totalTidMillis = slutTid - startTid;
    int totalTidSekunder = (int) (totalTidMillis / 1000);
    int totalTidMinuter = totalTidSekunder / 60;
    int totalTidSekunderKvar = totalTidSekunder % 60;
    System.out.println("Din totala tid blev " + totalTidMinuter + " min och " + totalTidSekunderKvar + " sekunder.");

    int totalTidFragaSekunder = (int) (totalTidFragaMillis / 1000);
    int maxTidPerFraga = 60;
    int totalMaxSekunder = antalRatt * maxTidPerFraga;
    int totalPoang = totalMaxSekunder - totalTidFragaSekunder;
    System.out.println("Du svarade de " + antalRatt + " frågorna på sammanlagt " + totalTidFragaSekunder + " sekunder vilket leder till " + totalPoang + " poäng!");

    }
}
