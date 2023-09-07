package UdemyAndHackerRankExercises;

import java.util.Scanner;

public class NinthEditionTesting {

    public static void displayHighScorePosition(String name, int position) {
        System.out.printf("%s managed to get into position %d on the high score list", name, position);

    }

    static int calculatingHighScorePosition(int score) {

        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int score = Integer.parseInt(scanner.nextLine());

        int position = calculatingHighScorePosition(score);
        displayHighScorePosition(name, position);


    }

}
