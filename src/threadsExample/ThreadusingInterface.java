package threadsExample;
class Thread1 implements Runnable {
    public void run() {
        System.out.println("Thread 1:");
        for (int i = 0; i < 5; i++) {
            // System.out.println("My thread is in running state" +i);

            System.out.println(i);
        }
    }

}

class Thread2 extends Thread{
       public void run(){
        System.out.println("Thread 2:");
        for (int i = 5; i < 10; i++)
        {
            // System.out.println("My thread is in running state" +i);
            System.out.println(i);
        }
    }

}

class Thread3 extends Thread{
    public void run(){
        System.out.println("Thread 3:");
        int num=5;
        for (int i = 1; i <=10; i++)
        {
            // System.out.println("My thread is in running state" +i);
            System.out.println(num+"*"+i+"="+num*i);
        }
    }

}

class Thread4 extends Thread{
        public void run(){
        System.out.println("Thread 4:");
        int num=5;
        int fact=1;
        for (int i = 1; i <=num ; i++)
        {
            fact = fact*i;
            System.out.println("Factorial is "+fact);
        }
    }

}

class Thread5 extends Thread{
    public void run(){
        System.out.println("Thread 5: fibo:");
        int num=5;
        int fibo=1;
        int n1=0;
        int n2=1;
        int nextnum;
        // int i;

        System.out.println(n1);
        System.out.println(n2);
        for (int i = 2; i <=num ; ++i)
        {
            nextnum= n1+n2;
            fibo=n1;
            n1=n2;
            n2=nextnum;
            System.out.println(nextnum);

        }

    }

}






public class ThreadusingInterface
{
    public static void main(String[] args) {
        Thread1 thrd = new Thread1();
        Thread t=new Thread(thrd);
        t.start();
        Thread2 thrd1=new Thread2();
        thrd1.start();
        Thread3 thrd3=new Thread3();
        thrd3.start();
        Thread4 thrd4=new Thread4();
        thrd4.start();
        Thread5 thrd5=new Thread5();
        thrd5.start();



    }
}
