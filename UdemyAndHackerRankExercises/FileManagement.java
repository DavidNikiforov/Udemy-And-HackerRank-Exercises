package UdemyAndHackerRankExercises;

import java.io.File;
import java.io.IOException;

public class FileManagement {
    public static void main(String[] args) {
        try {
            File file  = new File("D:\\Files\\newFile.txt");
            boolean isCreated = file.createNewFile();
            if (isCreated){
                System.out.println("File has been created");
            }else{
                System.out.println("File is already present");
            }
        }catch (IOException e){
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
