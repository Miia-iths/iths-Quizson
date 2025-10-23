package Miia;

public class TidFraga {

    public static void main(String[] args) {
        int poäng = 0; //från metoder.java för att motverka röd kod här

    ////Min kod back-up////

        long startTidFraga;
        long totalTidFragaMillis = 0;
        long svarsTid = 0;
        long startTid = System.currentTimeMillis();
    //deklarationer

        startTidFraga = System.currentTimeMillis();
    //startar tiden för frågan

    //fråga koden här

        long slutTidFraga = System.currentTimeMillis();
        svarsTid = slutTidFraga - startTidFraga;
    //och stoppar tiden för frågan här samt adderar den till tiden för rätt svar (alltså ligger där frågan blir rätt)
        
        if (svarsTid > 60000) {
            System.out.println("Du tog för lång tid! max svarstid är 60 sekunder.");}
    //lösningen istället för TimerTask som inte kan fungera pga öppen scanner, vad jag vet iallafall

        long slutTid = System.currentTimeMillis();
    //stopppar tiden för hela quizet

        long totalTidMillis = slutTid - startTid;
        int totalTidSekunder = (int) (totalTidMillis / 1000);
    //omvandlar till sekunder
        int totalTidMinuter = totalTidSekunder / 60;
        int totalTidSekunderKvar = totalTidSekunder % 60;
         
        System.out.println("Din totala tid blev " + totalTidMinuter + " min och " + totalTidSekunderKvar + " sekunder.");

        int totalTidFragaSekunder = (int) (totalTidFragaMillis / 1000);
        int maxTidPerFråga = 60;
        int totalMaxSekunder = poäng * maxTidPerFråga;
        int totalPoäng = totalMaxSekunder - totalTidFragaSekunder;
    //tar sekunder från rätt svar och gör till poäng iom resterande sekunder kvar.
        System.out.println("Du svarade de " + poäng + " frågorna på sammanlagt " + totalTidFragaSekunder + " sekunder vilket leder till " + totalPoäng + " poäng!");

    }
    
}
