
import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = in.nextInt();
        System.out.println("Enter the value of b : ");
        int b = in.nextInt();
        try {
            int c =a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("we can not divide by zero..");
        }
        
        System.out.println("Hello");
        System.out.println("hii");
    }
}
