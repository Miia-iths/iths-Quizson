package Meny;

public class Fråga {
    String fråga;
    String[] svarsAlternativ;
    int rättSvar;

    public Fråga(String fråga, String[] svarsAlternativ, int rättSvar){
        this.fråga = fråga;
        this.svarsAlternativ = svarsAlternativ;
        this.rättSvar = rättSvar;
    }

    public void visaFråga(){
        System.out.println(fråga);
        for (String alt : svarsAlternativ){
            System.out.println(alt);
        }
    }
}
