public class SumUsingMethod2 {
    static void sum(int a)
    {
      int digit;
      int sum =0;
      while(a!=0){
      digit = a%10;
      sum=sum+digit;
      a=a/10;
      
      }
      System.out.println(sum);
    } 
    public static void main(String[] args) {
        sum(123);
    }
}
