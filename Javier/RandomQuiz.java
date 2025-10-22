package Javier;

import java.util.ArrayList;

public class RandomQuiz {

     public static ArrayList<String> selectQuestions(String mode) {
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
     public static void startQuiz() {
        ArrayList<String> frågor = selectQuestions("Random");

        System.out.println("\nStartar quizet!");
        for (String fråga : frågor) {
            System.out.println("- " + fråga);
        }
     }
}