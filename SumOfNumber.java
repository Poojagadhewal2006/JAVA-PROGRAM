public class SumOfNumber {
    public static void main(String[] args) {
      /*   int a = 456;
        int res =0;
        int sum = 0;
        while(a>0)
        {
            int digit = a%10;
            res = res * 10 + digit;
            a = a/10;
            sum = sum + digit;
        }
        System.out.println(sum);*/
        int a = 123;
        int sum = 0;
        while(a>0)
        {
            sum = sum + a%10;
            a = a/10; 
        }
        System.out.println(sum);
    }
}
