public class MaximumSubarraySumUsing {
    public static void main(String[] args) {
        int arr [] = {2,-7,0,5,6,-3,0,1};
          int sum=0;
         for(int i=0;i<arr.length;i++)
        {
            
            sum=sum+arr[i];
        } 
      /*   for(int j=0;j<arr.length/2;j++)
        {
            sum = sum+arr[j];
        }*/
      
        System.out.println(sum);
    }
}
