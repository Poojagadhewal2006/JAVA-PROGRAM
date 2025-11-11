public class ExceptionHandling {
   public static void main(String[] args) {
  /*  int a=10; int b=5;
   int c =a/b;
   System.out.println(c);
   System.out.println("Hello");
   System.out.println("Hiii");
   System.out.println("Byee");*/


   int a =10; int b=2;
   try{
     int c = a/b;
     System.out.println(c);
   }catch(Exception e)
   {
     System.out.println("we can not divide by zero ....");
   }

   System.out.println("Hello");
   System.out.println("Hii");
   System.out.println("Byee");
   } 
}
