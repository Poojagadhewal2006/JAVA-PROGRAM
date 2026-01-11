public class Marge2Arrays {
    public static void main(String[] args) {
        int arr1[] = {1,2};
        int arr2[] = {3,4};
        int merged[] = new int[arr1.length + arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            merged[i] = arr1[i];
        }
        for(int j=0;j<arr2.length;j++)
        {
            merged[arr1.length + j] =arr2[j];
        }
        System.out.println("Merged Array :");
        for(int val : merged)
        {
           System.out.print(val + " ");
        }
    }
}
