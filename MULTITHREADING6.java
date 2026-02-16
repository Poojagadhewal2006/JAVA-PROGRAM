class withDrawThread extends Thread
{
    int balance =1000;
    int amount ;

    public withDrawThread(int amount) {
      this.amount=amount;
    }
    public void run() {
        synchronized(withDrawThread.class)
        {
        if(balance>=amount)
        {
            System.out.println(Thread.currentThread().getName());
          try {
               Thread.sleep(1000);
          }catch(InterruptedException ex)
          {
         }
        balance-=amount;
        System.out.println(Thread.currentThread().getName());
        }
        else 
        {
            System.out.println(Thread.currentThread().getName());
        }
    }  
}
}
public class MULTITHREADING6 {
    public static void main(String[] args) {
    withDrawal a  = new withDrawal(800);
    withDrawal a1  = new withDrawal(500);
    a.start();
    a1.start();
}
}
