package Miia;

public class StoppUr {
    public static void main(String[] args) {

    //För att veta hur lång tid som gått, använd datorns inbyggda klocka:
        long startTid = System.currentTimeMillis();
    
    //För att spara sluttiden (i long först för att få plats med milisekunder)
        long slutTid = System.currentTimeMillis();
    
    //För att räkna ut tiden som har gått och konvertera (1000 millisekunder = 1 sekund)
        long totalTidMillis = slutTid - startTid;
        int totalTidSekunder = (int) (totalTidMillis / 1000);

    //Sätt denna tillsammans med resten av statusen, poäng, antal rätt
        System.out.println("Din totala tid blev " + totalTidSekunder);
    }
}

