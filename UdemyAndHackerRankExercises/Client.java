package UdemyAndHackerRankExercises;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

    public void start() {
        try {
            Socket server = new Socket("localhost", 2101);

            Scanner in = new Scanner(server.getInputStream());
            PrintStream out = new PrintStream(server.getOutputStream());

            Thread readerThread = new Thread(() -> {
                while (true) {
                    if (in.hasNextLine())
                        System.out.println(in.nextLine());
                }
            });

            Thread writerThread = new Thread(() -> {
                Scanner console = new Scanner(System.in);
                String myName = console.nextLine();

                while (true) {
                    String line = console.nextLine();
                    out.println(myName + ": " + line);
                    if (line.contains("quit")) {
                        try {
                            server.close();
                        }
                        catch (IOException e){
                            e.printStackTrace();
                        }

                        return;
                    }
                }
            });

            readerThread.start();
            writerThread.start();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
