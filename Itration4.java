
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.jar.Attributes;

public class Itration4 {
    public static void main(String[] args) {
         ArrayList <String> names = new ArrayList<>();
        names.add("rahul");
        names.add("santi");
        names.add("rohit");
        names.add("mohit");
        names.add("om");
     
        ListIterator<String> it = names.listIterator();
        int count =0;
        while(it.hasPrevious())
        {
            count++;
            if(count != names.size())
            {
                it.set("hello");
            }
            System.out.println(names.size());
        }
        System.out.println(names);
    }
}
