import java.util.HashMap;

public class DymamicUsingHashmap {
   public static void main(String[] args) {
        //     <KEY    , DATATYPE>
        HashMap<String , Integer> map = new HashMap<>();
        /* map.put("Id",1);
         map.put("Id",2);
         map.put("Id",3);
         System.out.println(map);
        */

         map.put("Id0",1);
         map.put("Id1",2);
         map.put("Id2",3);
      //  map.remove("Id1",2);
      // System.out.println(map);
      // System.out.println(map.get("Id0"));
      // System.out.println(map.containsKey("Id0"));
      //   System.out.println(map.containsValue(1));

       /*   for(String key : map.keySet())
         {
            System.out.println(key);
         }
       */

       /*  for(int Value : map.values())
          {
            System.out.println(Value);
          }
       */
        
        map.forEach((key,value) -> {
            System.out.println(key + " " + value);
        });
    }
}

   

