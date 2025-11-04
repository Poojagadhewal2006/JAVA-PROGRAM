class emp{
 String name = "Manoj";
 int id = 1023;
 int salary = 15000;
 double bonus = salary*0.05;
 void EmployeeName()
 {
    System.out.println("Employee Name : " + name);
 }
 void EmployeeId()
 {
    System.out.println("Employee Id : " + id);
 }
 void EmployeeSalary()
 {
    System.out.println("Employee Salary : " + salary);
 }
    void increment()
    {
       System.out.println( "Employee Increment Salary : " + bonus);
    }
}

public class Employee {
    public static void main(String[] args) {
         emp obj = new emp();
        obj.EmployeeName();
        obj.EmployeeId();
        obj.EmployeeSalary();
        obj.increment();
        
    }
}
