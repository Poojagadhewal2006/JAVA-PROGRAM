public class LinearSearch {
    public static void  Search(int arr[],int targetValue)
    {
       
        for(int i=0;i<arr.length;i++)
        {// System.out.println(arr[i]);
           if(arr[i]==targetValue)
           {
             System.out.println(arr[i]);
           }
         //  else
         //  {
         //   System.out.println("-1");
         //  }
        }
        //return targetValue;
    }
    public static void main(String[] args) {
        int arr[] = {22,4,7,6,3,0,12};
        int targetValue = 7;
       // System.out.println("yuiyui");
        Search(arr,targetValue);
    }
}
