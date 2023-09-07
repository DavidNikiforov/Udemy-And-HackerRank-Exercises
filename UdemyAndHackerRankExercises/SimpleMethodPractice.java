package UdemyAndHackerRankExercises;

import java.util.Scanner;

public class SimpleMethodPractice {

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int result = sum(num1, num2);
        System.out.printf("%d + %d = %d",num1, num2, result);


    }
}
