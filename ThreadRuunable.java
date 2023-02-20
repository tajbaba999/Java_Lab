public class ThreadRuunable implements Runnable{
    public void run(){
        System.out.println("Running thread using Runnable interface ---!");
    }
    public static void main(String[] args) {
        ThreadRuunable ri = new ThreadRuunable();
        Thread t1 = new Thread(ri);
        t1.start();
        
    }
}
