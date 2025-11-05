class Atm 
{
     private int a;
     public void setRuppes(int b)
     {
        this.a=b;
     } 
     public int getRuppes()
     {
        return a;
     }
}
public class Encapsulation {
   public static void main(String[] args) {
    Atm obj = new Atm();
    obj.setRuppes(51);
    System.out.println(obj.getRuppes());
   } 
}
