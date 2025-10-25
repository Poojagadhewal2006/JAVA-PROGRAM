
import java.util.*;
public class Dynamic {
    public static void main(String[] args) {
        /*  String str = "Programming";   //p=1,r=2
      
        char ch[] = str.toCharArray();
        HashMap<Character , Integer> map = new HashMap<>();
        for(char i : ch)
        {
          map.put(i, map.getOrDefault(i,  0)+1);
        }
        System.out.println(map);
        
*/
      /*   String str1 = "programming is a fun and fun is a programming";
        String newStr[] = str1.split(" ");
        HashMap<String , Integer> map = new HashMap<>();
        for(String str: newStr)
        {
            map.put(str, map.getOrDefault(str,0 )+1);
        }
           System.out.println(map);
           */

           String str = "aaabcccdddeeef";
           
           HashMap<Character , Integer> map = new HashMap<>();
           for(char ch: str.toCharArray())
           {
            map.put(ch, map.getOrDefault(ch, 0));
           }
           for(char i : map.keySet())
           {
            if(map.get(i) == 1)
            {
                System.out.println(i);
                break;
            }
           }
    }

}
