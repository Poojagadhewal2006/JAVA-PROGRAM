import java.util.Scanner;

public class InputReturnModulus {
    public static void main(String[] args) {
         Scanner in = new   Scanner(System.in);
     System.out.println("Enter The Two Values:");
     int a = in.nextInt();
     int b = in.nextInt();
     int modulus;
     modulus =a%b;
     System.out.println(modulus);
    }
}
