package Meny;

public class Fråga {
    String fråga;
    String[] alternativ;
    int rättSvarIndex;

    public Fråga(String fråga, String[] alternativ, int rättSvarIndex){
        this.fråga = fråga;
        this.alternativ = alternativ;
        this.rättSvarIndex = rättSvarIndex;
    }

    public void visaFråga(){
        System.out.println(fråga);
        for (String alt : alternativ){
            System.out.println(alt);
        }
    }
}
