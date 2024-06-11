package multithreading;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

    private boolean flag;
    private final String fileName;

    public WriteFile(String fileName) {
        this.fileName = fileName;
        this.flag = false;
    }


    public synchronized void write1() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println("How are you?");
            notifyAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.flag = true;
    }

    public synchronized void write2() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println("I'm fine, thank you!");
            notifyAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.flag = false;
    }

}
