public class MultiThreading2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new myRunnable());
        t1.start(); 
    }
}

class myRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("This runnable Thread is running");
    }
}
