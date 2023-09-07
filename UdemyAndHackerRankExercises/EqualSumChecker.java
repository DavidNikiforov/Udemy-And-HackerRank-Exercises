package UdemyAndHackerRankExercises;

import java.util.Scanner;

public class EqualSumChecker {

    //checks if the sum of num1 and num2 are equal to num2
    public static boolean hasEqualSum(int num1, int num2, int num3){
        if (num1 + num2 == num3){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        boolean result = hasEqualSum(num1, num2, num3);
        System.out.println(result);

    }
}
