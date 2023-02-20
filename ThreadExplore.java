import java.io.*;
import java.lang.*;

public class ThreadExplore {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            public void run(){
                System.out.println("Thread is running");
            }
        });
        t.start();

        Thread currThread = Thread.currentThread();

        System.out.println("Name : "+currThread.getName());

        currThread.setName("main thread");
        
        System.out.println(" Id : "+ currThread.getId());

        System.out.println(" Priortiy : "+currThread.getPriority());


    }
}
