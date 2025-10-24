package Javier;

import java.util.ArrayList;

public class RandomQuiz {

    
    public static void startQuiz() {
        Quiz quiz = new Quiz(); 
        ArrayList<String> frågor = quiz.selectQuestions("Random");

        System.out.println("\n¡Spela!");
        for (String fråga : frågor) {
            System.out.println("- " + fråga);
        }
    }
}


class Quiz {

    public ArrayList<String> selectQuestions(String mode) {
        ArrayList<String> selectedList = new ArrayList<>();

        if (mode.equals("Random")) {
            selectedList.add("Fråga Random 1");
            selectedList.add("Fråga Random 2");
        } else if (mode.equals("Kategorier")) {
            selectedList.add("Fråga Kategori 1");
            selectedList.add("Fråga Kategori 2");
        }

        return selectedList;
    }
}