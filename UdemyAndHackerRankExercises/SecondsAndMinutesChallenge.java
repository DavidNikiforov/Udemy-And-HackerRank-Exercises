package UdemyAndHackerRankExercises;

import java.util.Scanner;

public class SecondsAndMinutesChallenge {

    public static String getDurationString(int seconds) {
        if (seconds < 0){
            return "Invalid data for seconds: " + seconds + ", must be a positive integer value!";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0){
            return "Invalid data for minutes: " + minutes + ", must be a positive integer value!";
        }

        if (seconds <= 0 || seconds >= 59) {
            return "Invalid data for seconds: " + seconds + ", must be between 0 and 59!";
        }
            int hours = minutes / 60;

            int remainingMinutes = minutes % 60;

            return hours + "h " + remainingMinutes + "m " + seconds + "s";
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();

        System.out.println(getDurationString(minutes, seconds));

       /* System.out.println(getDurationString(3945)); // first test case
        System.out.println(getDurationString(-65, 45)); // seconds test case
        System.out.println(getDurationString(65, 145)); // seconds test case*/
    }
}
