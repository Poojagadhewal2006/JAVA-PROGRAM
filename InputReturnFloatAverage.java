import java.util.Scanner;

public class InputReturnFloatAverage {
    public static void main(String[] args) 
    {
     Scanner in = new   Scanner(System.in);
     System.out.println("Enter The Three Values:");
     float a = in.nextFloat();
     float b = in.nextFloat();
     float c = in.nextFloat();
     float Average;
     Average = (a+b+c)/3;
     System.out.println(Average); 
    }
}

