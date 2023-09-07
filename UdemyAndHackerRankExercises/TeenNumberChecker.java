package UdemyAndHackerRankExercises;

import java.util.Scanner;

public class TeenNumberChecker {

    public static boolean hasTeen(int num1, int num2, int num3) {
        if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int age) {
        if (age >= 13 && age <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ages for 3 people: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the age for one person: ");
        int age = Integer.parseInt(scanner.nextLine());

        boolean check = hasTeen(num1, num2, num3);
        boolean ageCheck = isTeen(age);
        System.out.printf("The people are %d, %d and %d years old.\nAre there any teens: %b\n", num1, num2, num3, check);
        System.out.printf("Are they a teen: %b", ageCheck);
    }
}
