public class MethodReturn1 {
    static int sum(int a,int b)
    { 
        int c;
        return c=a+b;
        int count = 0;
        
        while(c>0)
        {
           
            int digit = c%10;
            if(digit>=count)
            {
                 c= c/10;
            } 
        }
       System.out.println(count);
    }
    public static void main(String[] args) {
        int output =sum(4,6);
        System.out.println(output);
    }
}
