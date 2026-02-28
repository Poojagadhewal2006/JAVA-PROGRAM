class Employee
{
void work()
{
    System.out.println(" Employee Is Working");
}
}
class Manager extends Employee{
 void attentedMeeting()
 {
    System.out.println("Manager Is Atteneding A Meeting ");
 }
}
public class SingleInheritance1
 {
    public static void main(String[] args)
     {
      Manager obj = new Manager();

      obj.attentedMeeting();
      obj.work();
     }
}
