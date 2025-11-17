import java.util.Scanner;

public class InputDifferanceBetweenSquare {
    public static void main(String[] args) {
         Scanner in = new   Scanner(System.in);
     System.out.println("Enter The Two Values:");
     int a = in.nextInt();
     int b = in.nextInt();
     int differance;
     differance = a*a-b*b;
     System.out.println(differance);
    }
}
