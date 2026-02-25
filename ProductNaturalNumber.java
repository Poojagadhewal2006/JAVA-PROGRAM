import java.util.Scanner;

public class ProductNaturalNumber {
     public static void Natural(int n)
    {
        int mul = 1;
      for(int i=1;i<=n;i++)
      {
        mul = mul * i;
      }
      System.out.println("Product Of Natural Number :" + mul);  
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


