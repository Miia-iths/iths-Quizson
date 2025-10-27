package Quizson;

public class Fraga {
    String fraga;
    String[] alternativ;
    int rattSvarIndex;

    public Fraga(String fraga, String[] alternativ, int rattSvarIndex){
        this.fraga = fraga;
        this.alternativ = alternativ;
        this.rattSvarIndex = rattSvarIndex;
    }

    public void visaFraga(){
        System.out.println(fraga);
        for (String alt : alternativ){
            System.out.println(alt);
        }
    }
}
