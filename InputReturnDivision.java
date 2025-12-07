import java.util.Scanner;

public class InputReturnDivision {
   public static void main(String[] args) {
     Scanner in = new   Scanner(System.in);
     System.out.println("Enter The Two Values:");
     int a = in.nextInt();
     int b = in.nextInt();
     int Division;
     Division = a/b;
     System.out.println(Division);
   } 
}
