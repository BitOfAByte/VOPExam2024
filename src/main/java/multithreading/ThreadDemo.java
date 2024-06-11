package multithreading;

public class ThreadDemo {
    public static void main (String [] args) {

        WriteFile wr=new WriteFile("file.txt");
        Task1 t1=new Task1 (wr);
        Task2 t2=new Task2 (wr);

        Thread th1=new Thread (t1);
        Thread th2=new Thread (t2);

        th1.start ();
        th2.start ();
    }
}