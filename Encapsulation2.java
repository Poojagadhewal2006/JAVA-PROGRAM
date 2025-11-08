

class Employee {
    
    private int id;
    private String name;
     private int salary;

     public void SetId(int id) {
         this.id = id;
     }

     public void SetName(String name) {
         this.name = name;
     }

     public void SetSalary(int salary) {
         this.salary = salary;
     }

     public int GetId() {
         return id;
     }
     public String GetName()
     {
        return name;
     }
     public int GetSalary()
     {
        return salary;
     }

}

public class Encapsulation2 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.SetId(20);
        obj.SetName("Pooja");
        obj.SetSalary(15000);
        System.out.println(obj.GetId());
        System.out.println(obj.GetName());
        System.out.println(obj.GetSalary());
    }
}
