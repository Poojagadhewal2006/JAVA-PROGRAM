import java.util.Scanner;

public class InputReturnDivideBy3 {
  public static void main(String[] args) {
     Scanner in = new   Scanner(System.in);
     System.out.println("Enter The Two Values:");
     int a = in.nextInt();
     //int b = in.nextInt();
     int Divide ;
     Divide = a%3;
     System.out.println(Divide);
  }  
}
