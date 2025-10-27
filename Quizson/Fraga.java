package Quizson;

public class Fraga {
    String fraga;
    String[] alternativ;
    int rattSvar;

    public Fraga(String fraga, String[] alternativ, int rattSvar){
        this.fraga = fraga;
        this.alternativ = alternativ;
        this.rattSvar = rattSvar;
    }

    public void visaFraga(){
        System.out.println(fraga);
        for (String alt : alternativ){
            System.out.println(alt);
        }
    }
}
