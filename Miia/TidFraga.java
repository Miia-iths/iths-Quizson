package Miia;

public class TidFraga {

    public static void main(String[] args) {
        
        long totalTidRattSvarMillis;

        long startTidFraga = System.currentTimeMillis();
        
        //fråga koden här
       
        long slutTidFraga = System.currentTimeMillis();
        long totalTidFragaMillis = slutTidFraga - startTidFraga;
        
        //behöver rättsvar koden
        if ((totalTidFragaMillis > 0) && (svar = rattSvar)){
            totalTidRattSvarMillis = totalTidFragaMillis - 6000; //om 60sek
        }
    
        long tidFragaRattMillis = slutTidFraga - startTidFraga;


    }
    
}
