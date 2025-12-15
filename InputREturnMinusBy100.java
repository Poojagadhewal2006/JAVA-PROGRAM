import java.util.Scanner;

public class InputREturnMinusBy100 {
    public static void main(String[] args) {
         Scanner in = new   Scanner(System.in);
     System.out.println("Enter The Two Values:");
     int a = in.nextInt();
     
     int val;
     val = 100 - a;
     System.out.println(val);
    }
}
