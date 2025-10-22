package Meny;

public class Metoder {
    import java.util.Scanner;

public class Metoder{

    public static void frågorOchSvar(String [] frågor, String [][] svarsAlternativ, int []rättSvar){
        Scanner scanner = new Scanner(System.in);
        int poäng = 0;
        for (int i = 0; i < frågor.length; i++) {
        
        System.out.println("Fråga " + (i + 1) + ": " + frågor[i]);

        for (String alt : svarsAlternativ[i]) {
            System.out.println(alt);
        }

        System.out.print("Skriv in ditt svar (1-4): ");
        int svar = scanner.nextInt();

        if (svar == rättSvar[i]) {
            System.out.println("Rätt svar!");
            poäng++;
        } else {
            System.out.println("Fel svar! Rätt svar var: " + svarsAlternativ[i][rättSvar[i] - 1]);
        }
    }  

    System.out.println("Du fick " + poäng + " av " + frågor.length + " rätt!");
    }
}

}
