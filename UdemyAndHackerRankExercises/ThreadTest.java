package UdemyAndHackerRankExercises;

public class ThreadTest {

    public ThreadTest(String name) {
    }

    public static void main(String[] args) {

        MyThread th = new MyThread("NameOfThread");
        th.start();
        System.out.println("I am the main thread");
    }

    void start() {
    }
}