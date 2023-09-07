package UdemyAndHackerRankExercises;

class MyThread extends ThreadTest {
    public MyThread(String name) {
        super(name);
    }

    void print() {
        System.out.println("I am a thread");
    }

    public void run() {
        this.print();
    }
}
