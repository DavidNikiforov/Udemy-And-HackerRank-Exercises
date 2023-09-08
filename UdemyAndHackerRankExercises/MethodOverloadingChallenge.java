package UdemyAndHackerRankExercises;

public class MethodOverloadingChallenge {

    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        return ((feet * 12) + inches) * 2.54;
    }

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5));
        System.out.println(convertToCentimeters(5, 9));
    }
}
