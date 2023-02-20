class Highpriority extends Thread{
    public void run(){
        for (int i = 0; i < 6; i++) {
            System.out.println("High Priority :"+i);
        }
    }
}
class Lowpriority extends Thread{
    public void run(){
        for (int i = 0; i < 6; i++) {
            System.out.println("Low Priority :"+i);
        }
    }
}

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        Highpriority h1 = new Highpriority();
        Lowpriority l1 = new Lowpriority();
        h1.setPriority(10);
        l1.setPriority(0);
        h1.start();
        l1.start();
        h1.join();
        l1.join();
        h1.getPriority();
        System.out.println(h1.getPriority());
        System.out.println(l1.getPriority());
    }
}
