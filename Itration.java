
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.ListIterator;

public class Itration {
    public static void main(String[] args) {
     
        ArrayList<String> list = new ArrayList();
        list.add("rahul");
        list.add("santi");
        list.add("om");
        list.add("mohit");
        list.add("Rohit");
        ListIterator<String> it = list.listIterator();
        while(it.hasNext())
        {
            String data = it.next();
            System.out.println(data);
        }
        
        System.out.println("alg h.....");
       
        while(it.hasPrevious())
        {
            String PrevData = it.previous();
            System.out.println(PrevData);
        }
    }
}
