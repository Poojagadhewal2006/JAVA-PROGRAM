import java.util.Scanner;

public class InputReturnMulThree {
   public static void main(String[] args) {
     Scanner in = new   Scanner(System.in);
     System.out.println("Enter The Three Values:");
     int a = in.nextInt();
     int b = in.nextInt();
     int c = in.nextInt();
     int mul;
     mul = a*b*c;
     System.out.println(mul);
   } 
}
