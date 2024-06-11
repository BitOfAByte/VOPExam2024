package multithreading;

public class Task2 implements Runnable {

    private final WriteFile wr;

    public Task2(WriteFile wr) {
        this.wr = wr;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            wr.write2();
        }
    }
}
