public class ExceptionHandling2 {
    public static void main(String[] args) {
       /*  int arr[] = {1,2,3,4,5};
        try {
           System.out.println(arr[6]); 
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Hello"); */

       /*  int a=4; int b=0;
        try {
            int c =a/b;
          System.out.println(c);  
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("hii"); */
    
        /*  int arr[] = {1,2,3,4,5};
        try {
           System.out.println(arr[6]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e ){
        System.out.println(e);
        }  */

        /*  int arr[] = {1,2,3,4,5};
        try {
           System.out.println(arr[6]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e ){
        System.out.println(e);
        }finally{
            System.out.println("Completed..");
        } */

           int arr[] = {1,2,3,4,5};
        try {
           System.out.println(arr[4]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e ){
        System.out.println(e);
        }finally{
            System.out.println("Completed..");
        }
    }
}
