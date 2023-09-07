package UdemyAndHackerRankExercises;

import java.util.Scanner;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false; // Invalid hour
        }

        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true; // Dog should wake up
        }

        return false; // Dog should not wake up
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isBarking = Boolean.getBoolean(scanner.nextLine()); // Change this to true or false as needed
        int hour = Integer.parseInt(scanner.nextLine()); // Change this to the current hour

        boolean shouldWake = shouldWakeUp(isBarking, hour);

        if (shouldWake) {
            System.out.println("The dog should wake up.");
        } else {
            System.out.println("The dog should not wake up.");
        }
    }
}
