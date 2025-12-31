import java.util.ArrayList;
import java.util.Iterator;

public class Itration1 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("rahul");
        list.add("santi");
        list.add("rohit");
        list.add("mohit");
        list.add("om");
        System.out.println(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext())
        {
            String data = it.next();
            if(data.startsWith("r"))
            {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
