import java.util.Scanner;

public class InputReturnSquareSum {
  public static void main(String[] args) {
     Scanner in = new   Scanner(System.in);
     System.out.println("Enter The Two Values:");
     int a = in.nextInt();
     int b = in.nextInt();
     int c = in.nextInt();
     int  sum;
     sum = a*a+b*b+c*c;
     System.out.println(sum);
     
  }  
}
