

class Student 
{
    private  String name ;
    private  int mark;
    public void setName(String name)
    {
        this.name = name; 
    }
    public void setMark(int mark)
    {
        this.mark = mark;
    }
    public String getName()
    {
        return this.name;
    }
    public int getMark()
    {
        return this.mark;
    }
}
public class Encapsulation1 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Pooja");
        obj.setMark(70);
       System.out.println(obj.getName());
       System.out.println(obj.getMark());
    }
}
