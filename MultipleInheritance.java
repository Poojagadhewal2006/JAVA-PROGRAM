interface  Client1
{
  void show();
}
interface Client2
{
  abstract void show();
  void print();
}
class Child implements Client1,Client2
{
    public void show()
    {
        System.out.println("For Both");
    }
    public void print()
    {
        System.out.println("Hiiii");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.print();
    }
}
