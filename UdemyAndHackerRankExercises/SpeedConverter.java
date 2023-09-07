package UdemyAndHackerRankExercises;

import java.util.Scanner;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        // Convert kilometers per hour to miles per hour
        long milesPerHour = Math.round(kilometersPerHour / 1.60934);
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kph = Double.parseDouble(scanner.nextLine());
        long mph = toMilesPerHour(kph);

        System.out.println(kph + " kilometers per hour is equal to " + mph + " miles per hour.");
    }
}
