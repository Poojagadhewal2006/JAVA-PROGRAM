import java.util.Scanner;

public class InputReturnPower {
    public static void main(String[] args) {
         Scanner in = new   Scanner(System.in);
     System.out.println("Enter The Two Values:");
     int a = in.nextInt();
     int b = in.nextInt();
     int result = 1;
     for(int i=1;i<=b;i++)
     {
        result*=a;
     }
     System.out.println(result);
    }
}
