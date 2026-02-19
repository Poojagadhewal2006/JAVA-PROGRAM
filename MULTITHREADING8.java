class MyThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(getName()+" is running with priority" );
            Thread.yield();
        }
    }
}
public class MULTITHREADING8 {
 public static void main(String[] args) {
    MyThread m = new MyThread();
    MyThread m1 = new MyThread();

    m.setName("Low Proirity Thread ");
    m1.setName("High Priority Thread");

    m.setPriority(Thread.MIN_PRIORITY);
    m1.setPriority(Thread.MAX_PRIORITY);

    m.start();
    m1.start();
 }
}

