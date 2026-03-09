

public class SumOfGivenNumber {
    public static void main(String[] args) {
        
    
    int a = 123;
    int sum =0;
    int digit;
    while(a>0)
    {
       digit = a%10;
       sum = sum + digit;
       a=a/10;
    }
    System.out.println("Sum Of Given Number: " + sum);
}

}
