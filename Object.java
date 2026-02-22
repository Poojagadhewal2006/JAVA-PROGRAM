class Student{
    String FirstName = "Pooja";
    String LastName = "Gadhewal";
    void FullName()
    {
        System.out.println(FirstName + "  " + LastName);
    }
}
public class Object {
    public static void main(String[] args) {
      Student obj = new Student();
      obj.FullName();  
     
    }
 }
 