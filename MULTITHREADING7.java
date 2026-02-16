public class MULTITHREADING7 {
  /*  public static void main(String[] args) {
    System.out.println("ider dekhooo");
    Thread t1 = new Thread(() -> {
        System.out.println("Hello");
    });
    Thread t2 = new Thread(() -> {
        System.out.println("Hiii");
    });
    t1.start();
    t2.start();
   } 
    */
   public static void main(String[] args) {
    System.out.println("ider dekhooo");
     
    Thread t1 = new Thread(() -> {
        System.out.println("Hello");
    });
    Thread t2 = new Thread(() -> {
        System.out.println("Hiii");
    });
    t1.start();
    t2.start();
    try {
        Thread.sleep(2000);
        System.out.println("mai last me hu");
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
   } 
}
