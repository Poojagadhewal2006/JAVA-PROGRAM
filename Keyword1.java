class Student
{
    int a;

    Student(int a) {
        this.a=a;
    }
    
    void sum()
    {
      System.out.println(a);
    }
}
public class Keyword1 {

    public static void main(String[] args) {
        Student obj = new Student(17);
        obj.sum();

    }
}
