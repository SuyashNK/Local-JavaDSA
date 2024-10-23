public class Multithreading {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start(); 
    }
}

class myThread extends Thread{

    @Override
    public void run() {
        System.out.println("This thread is running");
    }
}
