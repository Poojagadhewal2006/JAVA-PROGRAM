class MyThread extends Thread 
{
    public void run()
    {
        System.out.println("Hello");
        // System.out.println("Hii");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
         System.out.println("Hii");
    }
}
public class MULTITHREADING {
    public static void main(String[] args) {
    MyThread m = new MyThread();
    //m.run();
    m.start();
   /*  for(int i=0;i<5;i++)
    {
        System.out.println("Hii");
    }*/
}
}
