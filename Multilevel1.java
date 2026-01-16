class Person
{
     void displayName()
    {
      System.out.println("Name : Manoj");
    }
}
class Student extends Person
{
    void displayClass()
    {
        System.out.println("Class : 12th");
    }
}
class Moniter extends Student
{
    void checkDicipline()
    {
        System.out.println("Monitor Is Checking Disipline");
    }
}
public class Multilevel1 {
    public static void main(String[] args) {
        Moniter m = new Moniter();
        m.checkDicipline();
        m.displayClass();
        m.displayName();
    }
}
