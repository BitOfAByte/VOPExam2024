package multithreading;

public class Task1 implements Runnable {
    private final WriteFile wr;

    public Task1(WriteFile wr) {
        this.wr = wr;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            wr.write1();
        }
    }
}
