package Meny;

public class TidOchPoang {
    public static void tidPoang (long slutTid, long startTid, long startTidFraga, long totalTidFragaMillis, int antalRatt) {
        
        long totalTidMillis = slutTid - startTid;
        int totalTidSekunder = (int) (totalTidMillis / 1000);
        int totalTidMinuter = totalTidSekunder / 60;
        int totalTidSekunderKvar = totalTidSekunder % 60;

        int totalTidFragaSekunder = (int) (totalTidFragaMillis / 1000);
        int maxTidPerFråga = 60;
        int totalMaxSekunder = antalRatt * maxTidPerFråga;
        int totalPoäng = totalMaxSekunder - totalTidFragaSekunder;

        System.out.println("Din totala tid blev " + totalTidMinuter + " min och " + totalTidSekunderKvar + " sekunder.");
        System.out.println("Du svarade de " + antalRatt + " frågorna på sammanlagt " + totalTidFragaSekunder + " sekunder vilket leder till " + totalPoäng + " poäng!");

    }

}
