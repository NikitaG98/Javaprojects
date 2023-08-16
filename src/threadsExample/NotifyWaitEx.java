package threadsExample;

class Message{
    private String msg;
    public  String getMsg()
    {
        return msg;
    }
    public void setMsg(String msg){
        this.msg=msg;
    }
    public Message(String msg){
        super();
        this.msg=msg;
    }
 }
 class WaitMethod implements Runnable{

    private Message m;
     WaitMethod(Message m){
         this.m=m;
     }
     @Override
     public void run() {
        String s=Thread.currentThread().getName();
        synchronized (m){
            System.out.println(s+": Waiting to get Notified");
            try {
                m.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(s+" : got Notified");
            System.out.println(s+":Thread is processed"+m.getMsg());
         }
     }
 }

 class Notify implements Runnable{
     private Message m;
     Notify(Message m){
         this.m=m;
     }
     @Override
     public void run() {
         String s=Thread.currentThread().getName();
        // synchronized (m){
             System.out.println(s+":Started");
             try {
                 Thread.sleep(2000);
             }catch (InterruptedException e){
                 e.printStackTrace();
             }
             synchronized (m){
                 m.setMsg(s+": Notifier");
                 m.notifyAll();
         }
     }
 }
public class NotifyWaitEx
{
    public static void main(String[] args) {


        Message m1 = new Message("Process Thread");
        WaitMethod w = new WaitMethod(m1);
        new Thread(w, "waitthread1").start();
        WaitMethod w1 = new WaitMethod(m1);
        new Thread(w1,"waitthread2").start();
        Notify n = new Notify(m1);
        new Thread(n, "notify").start();
        System.out.println("All Thread Started");
    }

}
