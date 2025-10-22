package Miia;

public class TidFraga {

    public static void main(String[] args) {
        
        long totalTidRattSvarMillis;
        long totalTidFragaMillis;

        long startTidFraga = System.currentTimeMillis();
        
        //fråga koden här
       
        long slutTidFraga = System.currentTimeMillis();

        totalTidFragaMillis = slutTidFraga - startTidFraga;
        totalTidKvarMillis = 6000 - totalTidFragaMillis;
        
        //behöver rättsvar koden
        if ((totalTidKvarMillis > 0) && (svar = rattSvar)){
            totalTidRattSvarMillis = totalTidFragaMillis - 6000; //om 60sek
        }
    
        long tidFragaRattMillis = slutTidFraga - startTidFraga;


    }
    
}
