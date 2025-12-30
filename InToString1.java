public class InToString1 {
   public static void main(String args[])
   {
    int n = 123;
    String str = Integer.toString(n);

   for(int i=0;i<str.length();i++)
   {
    char digit = str.charAt(i);
    System.out.println(digit);
   }
    // System.out.println(str.length());
    // System.out.println(n);
   } 
}
