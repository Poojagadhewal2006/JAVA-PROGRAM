public class MaximumSubarraySum {
    public static void main(String[] args) {
        int arr[] = {2,3,5,5,-1,0,4};
        int MaxSum= 0;
        int currMax=0;

        for(int i=0;i<arr.length;i++)
        {

             currMax=currMax+arr[i];
             MaxSum=Math.max(currMax,currMax);
        }
        try {
            System.out.println("Maximum SubArray Sum : "+ MaxSum);
        } catch (ArithmeticException e) {
            System.out.println("currSum not find ");
        } 
    }
}
