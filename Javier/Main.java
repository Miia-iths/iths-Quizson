package Javier;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        System.out.println("Prova mode Random:");
        System.out.println(quiz.selectQuestions("Random"));

        System.out.println("Prova mode Kategorier:");
        System.out.println(quiz.selectQuestions("Kategorier"));
    }


}

class Quiz {
    
    public ArrayList<String> selectQuestions(String mode) {
        ArrayList<String> selectedList = new ArrayList<>();

        if (mode.equals("Random")) {
            selectedList.add("Fråga Random 1");
            selectedList.add("Fråga Random 2");
        } else if (mode.equals("Kategorier")) {
            selectedList.add("Fråga Random 1");
            selectedList.add("Fråga Random 2");
        }

        return selectedList;
    }
}