import java.util.Scanner;

public class InputPrintHarmonic {
    public static void main(String[] args) {
         Scanner in = new   Scanner(System.in);
     System.out.println("Enter The Two Values:");
     float a = in.nextFloat();
     float b = in.nextFloat();
     float harmonic;
     harmonic = (2)*((a*b)/(a+b));
     System.out.println(harmonic);
    }
}
