
import java.util.Scanner;

public class ReverseNaturalNumber {
    public static void Natural(int n)
    {
      for(int i=n;i>=0;i--)
      {
        System.out.println(i);
      }
    }
   public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n = obj.nextInt();
    System.out.println("Natural numbers from 1 to " + n + " : ");
    Natural(n);
    obj.close();
   }
}