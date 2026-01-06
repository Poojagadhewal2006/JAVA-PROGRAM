class Student
{
    Student()
    {
        System.out.println("Mai hu naaaaa!!!!!!");
    }
    Student(int a)
    {
       this();
       System.out.println(a);
    }
    Student(int a,int b)
    {
        //this(7);
        System.out.println(a+b);
    }
}
public class Keyword2 {
    public static void main(String[] args) {
       Student obj = new Student(4,6);
    }
}
