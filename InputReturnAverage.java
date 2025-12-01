import java.util.Scanner;

public class InputReturnAverage {
    public static void main(String[] args) {
         Scanner in = new   Scanner(System.in);
     System.out.println("Enter The Two Values:");
     int a = in.nextInt();
     int b = in.nextInt();
     int Average;
     Average = (a+b)/2;
     System.out.println(Average);
    }
}
