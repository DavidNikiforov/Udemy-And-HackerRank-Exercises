package UdemyAndHackerRankExercises;

import java.util.Scanner;

public class OverloadedAreaCalculator {

public static double area(double radius){
    if (radius < 0){
        return -1;
    }
    return Math.PI * radius * radius;
}

public static double area(double x, double y){
    if ((x < 0) || (y < 0) || (x < 0 && y < 0)){
        return -1;
    }
    return x * y;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number to find the area of a rectangle: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        double result = area(num1, num2);

        System.out.printf("The area of the rectangle is: %.2f\n", result);

        System.out.println("Enter the radius of a circle: ");
        double radius = Double.parseDouble(scanner.nextLine());
        double radiusResult;
        radiusResult = area(radius);
        System.out.printf("The area of the circle is: %.2f", radiusResult);

    }
}
