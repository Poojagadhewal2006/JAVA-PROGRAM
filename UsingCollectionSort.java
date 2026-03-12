
import java.util.ArrayList;
import java.util.Collections;

public class UsingCollectionSort {
   public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<>();
    /*arr.add("a");
    arr.add("c");
    arr.add("b"); */

    /*arr.add("B");
    arr.add("G");
    arr.add("A"); */

   /*  arr.add("A");
    arr.add("a");
    arr.add("Z");
    arr.add("z"); */

    arr.add("H");
    arr.add("z");
    arr.add("u");
    arr.add("V");
    arr.add("w");

    Collections.sort(arr);
    System.out.println(arr);
   } 
}
