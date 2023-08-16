package threadsExample;

class PowerNum{
    synchronized void displayPower(int num)
    {
        int temp=1;
        for (int i = 1; i <=10 ; i++)
        {
            System.out.println(num+"^"+i+"="+num*temp);
            temp=temp*num;
           // System.out.println();
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }

    }
}

class Power1 extends Thread{
    PowerNum p;
    Power1(PowerNum p){
       this.p=p;
    }
    public void run(){
        p.displayPower(3);
    }
}

class Power2 extends Thread{
    PowerNum p;
    Power2(PowerNum p){
        this.p=p;
    }
    public void run(){
        p.displayPower(5);
    }
}

public class SynchronizeEx
{
    public static void main(String[] args) {
        PowerNum pow=new PowerNum();
        Power1 power1=new Power1(pow);
        power1.start();
        Power2 power2=new Power2(pow);
        power2.start();
    }
}
