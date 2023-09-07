package UdemyAndHackerRankExercises;

import java.util.Scanner;

public class VariableSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        System.out.printf("a is: %d and b is: %d\n",a , b);

        a = a + b; //a = 30
        b = a - b; //b = 10
        a = a - b;

        System.out.printf("a is: %d and b is: %d ", a, b);


    }

}
