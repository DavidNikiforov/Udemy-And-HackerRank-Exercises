package UdemyAndHackerRankExercises;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0)
            System.out.println("Invalid Value");
        else
        {
            int megabytes= kiloBytes / 1024;
            int remaining_kilobytes=kiloBytes % 1024;
            System.out.println(kiloBytes+" KB = "+ megabytes +" MB and "+remaining_kilobytes+" KB");

        }

    }



}