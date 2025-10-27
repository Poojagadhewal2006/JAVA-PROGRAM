import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student{
    int rollN;
    String name;
    int age;

    public Student(int rollN,String name,int age)
    { 
       this.rollN=rollN;
       this.name = name;
       this.age = age;
    }
    public String toString()
    {
        return age + " " + name + " " + rollN;
    }
}
class sortByName implements Comparator<Student>
{
  public int compare(Student s1,Student s2)
  {
    return s1.name.compareTo(s2.name);
  }
}
class sortByRollN implements Comparator<Student>
{
  public int compare(Student s1,Student s2)
  {
    return s1.rollN-s2.rollN;
  }
}
class sortByAge implements Comparator<Student>
{
  public int compare(Student s1,Student s2)
  {
    return s1.age-s2.age;
  }
}
public class Dynamic3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(55,"Rohit",12));
        list.add(new Student(44,"Pooja",32));
        list.add(new Student(32,"Manu",62));
        Collections.sort(list,new sortByName());
        for(Student s : list)
        {
         System.out.println(s);
        }  
        Collections.sort(list,new sortByRollN());
        for(Student s : list)
        {
         System.out.println(s);
        }  
        Collections.sort(list,new sortByAge());
        for(Student s : list)
        {
         System.out.println(s);
        }  
  }
}