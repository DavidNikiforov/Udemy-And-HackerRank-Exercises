package UdemyAndHackerRankExercises;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {


    public Server() {
        clients = new ArrayList<>();
        lock = new Object();
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.start();
    }

    private List<PrintStream> clients;
    private final Object lock;


    public void start() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(2101)) {

            while (true) {
                Socket client = serverSocket.accept();

                Thread clientThread = new Thread(() -> {
                    try {
                        Scanner in = new Scanner(client.getInputStream());
                        PrintStream out = new PrintStream(client.getOutputStream());

                        synchronized (lock) {
                            clients.add(out);
                        }

                        while (true) {
                            String line = in.nextLine();
                            if (line.contains("quit")) {
                                synchronized (lock) {
                                    clients.remove(out);
                                }
                                return;
                            }


                            for (PrintStream c : clients)
                                c.println(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                clientThread.start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}