import java.util.Scanner;

public class InputProductDivideBySum {
    public static void main(String[] args) {
         Scanner in = new   Scanner(System.in);
     System.out.println("Enter The Two Values:");
     int a = in.nextInt();
     int b = in.nextInt();
     int product ;
     product = a*b;
     System.out.println(product);
     int sum;
     sum = a+b;
     System.out.println(sum);
     int ans;
     ans = product/sum;
     System.out.println(ans);
    }
}
