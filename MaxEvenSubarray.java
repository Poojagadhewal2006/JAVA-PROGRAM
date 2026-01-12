public class MaxEvenSubarray {
    public static void main(String[] args) {
        int arr[] = {2,-7,0,5,6,-3,0,1,53,0,534,0};
        int even;
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2 == 0)
            {
                even=arr[i];
                sum = sum+even;
            }
        }
        System.out.println(sum);
    }
}
