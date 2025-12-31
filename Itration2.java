import java.util.ArrayList;
import java.util.ListIterator;

public class Itration2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("rahul");
        list.add("santi");
        list.add("rohit");
        list.add("mohit");
        list.add("om");
       // System.out.println(list);
        ListIterator<String> it = list.listIterator();
        while(it.hasNext())
        {
            String data = it.next();
            if(data.length()<3)
            {
              data = "Bye";
            }
            System.out.println(data);
        }
    }
}
