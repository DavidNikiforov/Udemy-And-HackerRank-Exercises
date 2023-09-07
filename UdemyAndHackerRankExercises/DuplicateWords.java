package UdemyAndHackerRankExercises;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some text: ");

        String text = input.nextLine();
        String[] words = text.split("\\s+");

        HashMap<String, Integer> wordCounts = new HashMap<String, Integer>();

        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                int count = wordCounts.get(word);
                wordCounts.put(word, count + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        System.out.println("Duplicate words:");
        for (String word : wordCounts.keySet()) {
            if (wordCounts.get(word) > 1) {
                System.out.println(word);
            }
        }
    }
}
