class withDrawal extends Thread
{
    static int totalBalance = 1000;
    int amount ;

    public withDrawal(int amount) {
      this.amount=amount;
    }
    public void run() {
        if(totalBalance>=amount)
        {
            System.out.println("is going to withdrewable......" + " " + amount);
          try {
               Thread.sleep(1000);
          }catch(InterruptedException ex)
          {
         }
        totalBalance-=amount;
        System.out.println("Remaining paisaaaaaaaaa" + " " + totalBalance);
        }
        else 
        {
            System.out.println("sorryyyy aapke account me paise kam h....");
        }
    }  
}
public class MULTITHREADING5 {
   public static void main(String[] args) {
    withDrawal a  = new withDrawal(800);
    withDrawal a1  = new withDrawal(500);
    a.start();
    a1.start();
    //System.out.println();
   } 
}
