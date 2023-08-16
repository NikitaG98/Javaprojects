package threadsExample;

class MultiThread extends Thread {
    public void run() {
       System.out.println("running thread name: "+ this.currentThread().getName());
        System.out.println("running thread priority: "+ this.currentThread().getPriority());

    }
}
public class MultiThrd {
    public static void main(String[] args) {
        MultiThread thrd1=new MultiThread();
        thrd1.setName("First Thread");
        thrd1.setPriority(Thread.MIN_PRIORITY);
        MultiThread thrd2=new MultiThread();
        thrd2.setName("Second Thread");
        thrd2.setPriority(Thread.MAX_PRIORITY);
        MultiThread thrd3=new MultiThread();
        thrd3.setName("Third Thread");
        thrd1.start();
        thrd2.start();
        thrd3.start();
    }
}
